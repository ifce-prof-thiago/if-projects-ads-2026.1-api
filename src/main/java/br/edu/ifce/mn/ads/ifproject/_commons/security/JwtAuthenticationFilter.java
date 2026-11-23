package br.edu.ifce.mn.ads.ifproject._commons.security;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;

    public JwtAuthenticationFilter(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        final var header = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        final UUID userId;
        try {
            userId = jwtService.parseUserId(header.substring("Bearer ".length()));
        } catch (JwtException | IllegalArgumentException ex) {
            writeUnauthorized(response, "Token inválido ou expirado");
            return;
        }

        final var authentication = new UsernamePasswordAuthenticationToken(userId, null, List.of());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        try {
            ScopedValue.where(UserLogged.USER_ID, userId.toString()).run(() -> {
                try {
                    filterChain.doFilter(request, response);
                } catch (IOException | ServletException e) {
                    throw new FilterChainException(e);
                }
            });
        } catch (FilterChainException e) {
            if (e.getCause() instanceof IOException ioException) {
                throw ioException;
            }
            if (e.getCause() instanceof ServletException servletException) {
                throw servletException;
            }
            throw new ServletException(e.getCause());
        }
    }

    private static void writeUnauthorized(HttpServletResponse response, String message) throws IOException {
        ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, message);
    }

    private static final class FilterChainException extends RuntimeException {
        private FilterChainException(Throwable cause) {
            super(cause);
        }
    }
}
