package br.edu.ifce.mn.ads.ifproject._commons.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@ConfigurationProperties(prefix = "app.jwt")
public record JwtProperties(
        String secret,
        Duration expiration,
        Duration refreshExpiration
) {
}
