package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject.users.application.controllers.api.ICreateUserApi;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.search_user.ISearchUser;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")
@Tag(name = "Usuários", description = "Gerenciamento de Usuários")
public class UserController implements ICreateUserApi {

    private final ICreateUser createUser;
    private final IUpdateUser updateUser;
    private final IUpdateUserPassword updateUserPassword;
    private final IActivateUser activateUser;
    private final IFindUser findUser;
    private final ISearchUser searchUser;

    public UserController(
            ICreateUser createUser,
            IUpdateUser updateUser,
            IUpdateUserPassword updateUserPassword,
            IActivateUser activateUser,
            IFindUser findUser,
            ISearchUser searchUser
    ) {
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.updateUserPassword = updateUserPassword;
        this.activateUser = activateUser;
        this.findUser = findUser;
        this.searchUser = searchUser;
    }

    public ICreateUser.CreateUserOutput post(@RequestBody ICreateUser.CreateUserInput input) {
        return createUser.execute(input);
    }

    // Não exige X-User-Id (login simulado / "adicionar membro"). Ver UserLoggedFilter.
    @GetMapping("search")
    public IFindUser.UserOutput search(
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String username
    ) {
        return searchUser.execute(email, username);
    }

    @GetMapping("{user_id}")
    public IFindUser.UserOutput get(@PathVariable("user_id") UUID id) {
        return findUser.execute(id);
    }

    @PatchMapping("{user_id}")
    public IUpdateUser.UpdateUserOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody IUpdateUser.UpdateUserInput input
    ) {
        return updateUser.execute(id, input);
    }

    @PatchMapping("{user_id}/password")
    public IUpdateUserPassword.UpdateUserPasswordOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody IUpdateUserPassword.UpdateUserPasswordInput input
    ) {
        return updateUserPassword.execute(id, input);
    }

    @PatchMapping("{user_id}/active")
    public IActivateUser.ActivateUserOutput patch(
            @PathVariable("user_id") UUID id
    ) {
        return activateUser.execute(id);
    }

}
