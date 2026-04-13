package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import br.edu.ifce.mn.ads.ifproject.users.domain.models.Username;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ICreateUser {

    CreateUserOutput execute(@Valid CreateUserInput input);

    record CreateUserInput(
            @Username String username,
            @Email String email,
            @Password String password
    ) {
    }

    record CreateUserOutput(
            Long id
    ) {
    }

}
