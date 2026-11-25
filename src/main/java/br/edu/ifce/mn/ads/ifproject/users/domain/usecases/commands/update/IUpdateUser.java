package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Username;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateUser {

    UpdateUserOutput execute(UUID id, @Valid UpdateUserInput input);

    record UpdateUserInput(
            @Username String username,
            @Email String email
    ) {
    }

    record UpdateUserOutput(
            UUID id
    ) {
    }
}
