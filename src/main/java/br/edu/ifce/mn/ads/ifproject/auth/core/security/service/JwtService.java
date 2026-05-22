package br.edu.ifce.mn.ads.ifproject.auth.core.security;

import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class JwtService {

    public String generateToken(String email) {
        Algorithm algorithm = Algorithm.HMAC256("mysecretkey");

        return JWT.create()
            .withIssuer("if-projects-ads-2026.1-api")
            .withSubject(email)
            .withExpiresAt(generateExpirationDate())
            .sign(algorithm); 
    }

    private Instant generateExpirationDate() {
        return LocalDateTime.now()
            .plusHours(2)
            .toInstant(ZoneOffset.of("-03:00"));
    }

    public String validateToken(String token) {

        try {
            Algorithm algorithm = Algorithm.HMAC256("mysecretkey");

            return JWT.require(algorithm)
                .withIssuer("if-projects-ads-2026.1-api")
                .build()
                .verify(token)
                .getSubject();

        }   catch (JWTVerificationException exception) {
            return "";
        }
    }

} 