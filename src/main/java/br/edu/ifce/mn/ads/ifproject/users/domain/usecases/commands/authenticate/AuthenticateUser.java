package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
import br.edu.ifce.mn.ads.ifproject._commons.security.RefreshTokenService;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class AuthenticateUser implements IAuthenticateUser {

    private final IUserRepository repository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final RefreshTokenService refreshTokenService;

    public AuthenticateUser(
            IUserRepository repository,
            JwtService jwtService,
            PasswordEncoder passwordEncoder,
            RefreshTokenService refreshTokenService
    ) {
        this.repository = repository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
        this.refreshTokenService = refreshTokenService;
    }

    @Override
    public AuthenticateUserOutput execute(AuthenticateUserInput input) {
        final var user = repository.findByEmail(input.email())
                .orElseThrow(InvalidCredentialsException::new);
        if (passwordEncoder.matches(input.password(), user.passwordHash())) {
            return output(user);
        }
        if (matchesLegacyMd5(input.password(), user.passwordHash())) {
            repository.updatePassword(user.id(), passwordEncoder.encode(input.password()));
            return output(user);
        }
        throw new InvalidCredentialsException();
    }

    private AuthenticateUserOutput output(IUserRepository.AuthenticatedUserWithPassword user) {
        return new AuthenticateUserOutput(
                user.id(),
                user.username(),
                user.email(),
                jwtService.issue(user.id()),
                "Bearer",
                jwtService.expirationSeconds(),
                refreshTokenService.issue(user.id())
        );
    }

    /**
     * Compatibilidade transitória para contas já gravadas com MD5. No primeiro
     * login válido, a senha é substituída por BCrypt e nunca mais usa este ramo.
     */
    private static boolean matchesLegacyMd5(String password, String storedHash) {
        if (storedHash == null || !storedHash.matches("[a-fA-F0-9]{32}")) {
            return false;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5")
                    .digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hash = new StringBuilder(32);
            for (byte value : digest) {
                hash.append(String.format("%02x", value));
            }
            return MessageDigest.isEqual(
                    hash.toString().getBytes(StandardCharsets.US_ASCII),
                    storedHash.toLowerCase().getBytes(StandardCharsets.US_ASCII)
            );
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("Algoritmo MD5 indisponível", ex);
        }
    }
}
