package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
import br.edu.ifce.mn.ads.ifproject._commons.security.RefreshTokenService;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RefreshSession implements IRefreshSession {

    private final RefreshTokenService refreshTokenService;
    private final IUserRepository userRepository;
    private final JwtService jwtService;

    public RefreshSession(
            RefreshTokenService refreshTokenService,
            IUserRepository userRepository,
            JwtService jwtService
    ) {
        this.refreshTokenService = refreshTokenService;
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    @Override
    @Transactional
    public IAuthenticateUser.AuthenticateUserOutput execute(RefreshSessionInput input) {
        var userId = refreshTokenService.consume(input.refreshToken());
        var user = userRepository.findById(userId).orElseThrow(InvalidCredentialsException::new);
        return new IAuthenticateUser.AuthenticateUserOutput(
                user.id(),
                user.username(),
                user.email(),
                jwtService.issue(user.id()),
                "Bearer",
                jwtService.expirationSeconds(),
                refreshTokenService.issue(user.id())
        );
    }
}
