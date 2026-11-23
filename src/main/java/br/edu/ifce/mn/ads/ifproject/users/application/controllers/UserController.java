package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final ICreateUser createUser;
    private final IAuthenticateUser authenticateUser;
    private final IUpdateUser updateUser;
    private final IUpdateUserPassword updateUserPassword;
    private final IActivateUser activateUser;

    public UserController(
            ICreateUser createUser,
            IAuthenticateUser authenticateUser,
            IUpdateUser updateUser,
            IUpdateUserPassword updateUserPassword,
            IActivateUser activateUser
    ) {
        this.createUser = createUser;
        this.authenticateUser = authenticateUser;
        this.updateUser = updateUser;
        this.updateUserPassword = updateUserPassword;
        this.activateUser = activateUser;
    }

    @PostMapping
    public ResponseEntity<ICreateUser.CreateUserOutput> post(@RequestBody @Valid ICreateUser.CreateUserInput input) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createUser.execute(input));
    }

    @Deprecated(since = "1.0", forRemoval = false)
    @PostMapping("/login")
    public IAuthenticateUser.AuthenticateUserOutput login(@RequestBody @Valid IAuthenticateUser.AuthenticateUserInput input) {
        return authenticateUser.execute(input);
    }

    @PatchMapping("{user_id}")
    public IUpdateUser.UpdateUserOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody @Valid IUpdateUser.UpdateUserInput input
    ) {
        requireCurrentUser(id);
        return updateUser.execute(id, input);
    }

    @PatchMapping("{user_id}/password")
    public IUpdateUserPassword.UpdateUserPasswordOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody @Valid IUpdateUserPassword.UpdateUserPasswordInput input
    ) {
        requireCurrentUser(id);
        return updateUserPassword.execute(id, input);
    }

    @PatchMapping("{user_id}/active")
    public IActivateUser.ActivateUserOutput patch(
            @PathVariable("user_id") UUID id
    ) {
        requireCurrentUser(id);
        return activateUser.execute(id);
    }

    private static void requireCurrentUser(UUID id) {
        if (!UserLogged.id().equals(id)) {
            throw new ApiException(HttpStatus.FORBIDDEN, "Você não tem permissão para alterar este usuário");
        }
    }
}
