package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IUpdateUserPassword {

    UpdateUserPasswordOutput execute(Long id, @Valid UpdateUserPasswordInput input);

    record UpdateUserPasswordInput(
            @Password String oldPassword,
            @Password String newPassword
    ) {
    }

    record UpdateUserPasswordOutput(
            Long id
    ) {
    }

}
