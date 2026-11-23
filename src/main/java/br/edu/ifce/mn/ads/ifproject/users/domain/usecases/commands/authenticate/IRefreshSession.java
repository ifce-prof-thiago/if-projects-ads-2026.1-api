package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IRefreshSession {

    IAuthenticateUser.AuthenticateUserOutput execute(@Valid RefreshSessionInput input);

    record RefreshSessionInput(@NotBlank String refreshToken) {
    }
}
