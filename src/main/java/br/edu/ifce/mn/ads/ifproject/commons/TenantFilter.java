package br.edu.ifce.mn.ads.ifproject.commons;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class TenantFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) {
        final var userId = request.getHeader("X-User-Id");
        ScopedValue.where(UserLogged.USER_ID, userId).run(() -> {
            try {
                filterChain.doFilter(request, response);
            } catch (ServletException | IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
