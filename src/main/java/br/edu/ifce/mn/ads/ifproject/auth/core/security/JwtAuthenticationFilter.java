package br.edu.ifce.mn.ads.ifproject.auth.core.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.annotation.Autowrited;
import org.springframework.web.filter.OncePerRequestFilter;

@component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowrited
    private JwtService jwtService;

    @override
    protected void doFilterInternal(
        jakarta.servlet.http.HttpServletRequest request,
        jakarta.servlet.http.HttpServletResponse response,
        jakarta.servlet.FilterChain filterChain
    ) throws java.io.IOException, jakarta.servlet.ServletException {
        String token = request.getHeader("Authorization");

        if(token != null) {
            token = token.replace("Bearer ", "");

            string email = jwtService.validateToken(token);

            System.out.println("email");
        }

        filterChain.doFilter(request, response);
    }

}