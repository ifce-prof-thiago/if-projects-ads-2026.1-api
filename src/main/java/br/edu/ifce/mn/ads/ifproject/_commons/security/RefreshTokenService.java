package br.edu.ifce.mn.ads.ifproject._commons.security;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;

@Component
public class RefreshTokenService {

    private static final SecureRandom RANDOM = new SecureRandom();

    private final JdbcClient db;
    private final JwtProperties properties;

    public RefreshTokenService(JdbcClient db, JwtProperties properties) {
        this.db = db;
        this.properties = properties;
    }

    public String issue(UUID userId) {
        byte[] bytes = new byte[48];
        RANDOM.nextBytes(bytes);
        String token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        db.sql("""
                        INSERT INTO refresh_tokens(user_id, token_hash, expires_at)
                        VALUES (?, ?, CURRENT_TIMESTAMP + (? * INTERVAL '1 second'))
                        """)
                .params(userId, sha256(token), properties.refreshExpiration().toSeconds())
                .update();
        return token;
    }

    /** Consome o token e devolve o usuário; o chamador deve emitir o substituto. */
    public UUID consume(String token) {
        return db.sql("""
                        UPDATE refresh_tokens
                        SET revoked_at = CURRENT_TIMESTAMP
                        WHERE token_hash = ?
                          AND revoked_at IS NULL
                          AND expires_at > CURRENT_TIMESTAMP
                        RETURNING user_id
                        """)
                .param(sha256(token))
                .query(UUID.class)
                .optional()
                .orElseThrow(InvalidCredentialsException::new);
    }

    private static String sha256(String value) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256")
                    .digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder result = new StringBuilder(64);
            for (byte valueByte : digest) {
                result.append(String.format("%02x", valueByte));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("Algoritmo SHA-256 indisponível", ex);
        }
    }
}
