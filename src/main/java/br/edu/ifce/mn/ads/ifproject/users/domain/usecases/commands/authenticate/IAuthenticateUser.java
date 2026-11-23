package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IAuthenticateUser {

    AuthenticateUserOutput execute(@Valid AuthenticateUserInput input);

    record AuthenticateUserInput(
            @Email(message = "Informe um e-mail válido") String email,
            @Password String password
    ) {
    }

    record AuthenticatedUser(
            UUID id,
            String username,
            String email
    ) {
    }

    record AuthenticateUserOutput(
            UUID id,
            String username,
            String email,
            String accessToken,
            String tokenType,
            long expiresIn,
            String refreshToken
    ) {
    }
}
