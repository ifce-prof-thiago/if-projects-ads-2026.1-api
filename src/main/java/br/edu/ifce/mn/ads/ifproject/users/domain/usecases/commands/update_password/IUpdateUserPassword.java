package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateUserPassword {

    UpdateUserPasswordOutput execute(UUID id, @Valid UpdateUserPasswordInput input);

    record UpdateUserPasswordInput(
            @Password String oldPassword,
            @Password String newPassword
    ) {
    }

    record UpdateUserPasswordOutput(
            UUID id
    ) {
    }

}
