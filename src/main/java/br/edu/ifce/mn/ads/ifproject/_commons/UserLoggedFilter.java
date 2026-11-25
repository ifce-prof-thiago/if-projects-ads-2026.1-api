package br.edu.ifce.mn.ads.ifproject._commons;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Lê o header X-User-Id e disponibiliza o usuário logado via {@link UserLogged}.
 * Header ausente ou com UUID inválido → 401 em JSON.
 */
@Component
public class UserLoggedFilter extends OncePerRequestFilter {

    public static final String HEADER = "X-User-Id";

    private static final AntPathMatcher MATCHER = new AntPathMatcher();

    // Rotas que não exigem X-User-Id (qualquer método).
    private static final List<String> PUBLIC_PATHS = List.of(
            "/api/v1/public", "/api/v1/public/**",
            "/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs", "/v3/api-docs/**",
            "/error"
    );

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        final var method = request.getMethod();
        final var path = request.getRequestURI().substring(request.getContextPath().length());

        if (HttpMethod.OPTIONS.matches(method)) return true; // preflight CORS
        if (PUBLIC_PATHS.stream().anyMatch(p -> MATCHER.match(p, path))) return true;

        // Cadastro e "login simulado" acontecem antes de o front conhecer o id do usuário.
        if (HttpMethod.POST.matches(method) && path.equals("/api/v1/users")) return true;
        return HttpMethod.GET.matches(method) && path.equals("/api/v1/users/search");
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        final var userId = request.getHeader(HEADER);

        if (userId == null || userId.isBlank()) {
            unauthorized(response, "Header " + HEADER + " é obrigatório");
            return;
        }

        try {
            UUID.fromString(userId.trim());
        } catch (IllegalArgumentException e) {
            unauthorized(response, "Header " + HEADER + " deve ser um UUID válido");
            return;
        }

        try {
            ScopedValue.where(UserLogged.USER_ID, userId.trim())
                    .run(() -> {
                        try {
                            filterChain.doFilter(request, response);
                        } catch (IOException | ServletException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException ioException) throw ioException;
            if (cause instanceof ServletException servletException) throw servletException;
            throw e;
        }
    }

    private void unauthorized(HttpServletResponse response, String message) throws IOException {
        final var status = HttpStatus.UNAUTHORIZED;
        response.setStatus(status.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.getWriter().write("""
                {"status":%d,"error":"%s","message":"%s","timestamp":"%s"}"""
                .formatted(status.value(), status.getReasonPhrase(), message, LocalDateTime.now()));
    }
}
