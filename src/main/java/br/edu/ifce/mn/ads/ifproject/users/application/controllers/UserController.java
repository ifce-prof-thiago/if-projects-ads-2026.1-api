package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.deactivate.IDeactivateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final ICreateUser createUser;
    private final IUpdateUser updateUser;
    private final IUpdateUserPassword updateUserPassword;
    private final IActivateUser activateUser;
    private final IDeactivateUser deactivateUser;

    public UserController(
            ICreateUser createUser,
            IUpdateUser updateUser,
            IUpdateUserPassword updateUserPassword,
            IActivateUser activateUser,
            IDeactivateUser deactivateUser
    ) {
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.updateUserPassword = updateUserPassword;
        this.activateUser = activateUser;
        this.deactivateUser = deactivateUser;
    }

    @PostMapping
    public ICreateUser.CreateUserOutput post(@RequestBody ICreateUser.CreateUserInput input) {
        return createUser.execute(input);
    }

    @PatchMapping("{user_id}")
    public IUpdateUser.UpdateUserOutput patch(
            @PathVariable("user_id") Long id,
            @RequestBody IUpdateUser.UpdateUserInput input
    ) {
        return updateUser.execute(id, input);
    }

    @PatchMapping("{user_id}/password")
    public IUpdateUserPassword.UpdateUserPasswordOutput patch(
            @PathVariable("user_id") Long id,
            @RequestBody IUpdateUserPassword.UpdateUserPasswordInput input
    ) {
        return updateUserPassword.execute(id, input);
    }

    @PatchMapping("{user_id}/active")
    public IActivateUser.ActivateUserOutput patch(
            @PathVariable("user_id") Long id
    ) {
        return activateUser.execute(id);
    }

    // crio o endpoint para desativar a conta, seguindo o mesmo padrao do active
    @PatchMapping("{user_id}/deactive")
    public IDeactivateUser.DeactivateUserOutput deactive(
            @PathVariable("user_id") Long id
    ) {
        return deactivateUser.execute(id);
    }

}