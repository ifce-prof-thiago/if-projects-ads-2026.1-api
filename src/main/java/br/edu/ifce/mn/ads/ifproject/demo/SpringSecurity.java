package br.edu.ifce.mn.ads.ifproject.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurity {

    private static final String[] PUBLICS_ROUTES = {
            "/api/v1/public",
            "/api/v1/public/**"
    };

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth ->
                        auth
                                .requestMatchers(PUBLICS_ROUTES).permitAll()
                                .requestMatchers("/api/v1/admin").hasRole("ADMIN")
                                .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService(PasswordEncoder encoder) {
        var joao = User.builder()
                .username("joao")
                .password(encoder.encode("joao"))
                .build();

        var maria = User.builder()
                .username("maria")
                .password(encoder.encode("123"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(joao, maria);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
