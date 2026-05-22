package br.edu.ifce.mn.ads.ifproject.auth.core.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import br.edu.ifce.mn.ads.ifproject.auth.core.security.service.CustomUserDetailsService;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    @Override
    protected void doFilterInternal(
        jakarta.servlet.http.HttpServletRequest request,
        jakarta.servlet.http.HttpServletResponse response,
        jakarta.servlet.FilterChain filterChain
    ) throws java.io.IOException, jakarta.servlet.ServletException {
        String token = request.getHeader("Authorization");

        if(token != null) {
            token = token.replace("Bearer ", "");

            String email = jwtService.validateToken(token);

            if(!email.isEmpty()) {
                var userDetails = customUserDetailsService.loadUserByUsername(email);

                var authentication = new UsernamePasswordAuthenticationToken(
                    userDetails,
                    null,
                    userDetails.getAuthorities()
                );

                SecurityContextHolder
                    .getContext()
                    .setAuthentication(authentication);
            }


            System.out.println("email");
        }

        filterChain.doFilter(request, response);
    }

}