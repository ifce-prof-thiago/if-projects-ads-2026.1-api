package br.edu.ifce.mn.ads.ifproject._commons;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class UserLoggedFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        final var userId = request.getHeader("X-User-Id");

        if (userId != null && !userId.isBlank()) {
            try {
                ScopedValue.where(UserLogged.USER_ID, userId)
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
                throw new ServletException(e);
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }
}