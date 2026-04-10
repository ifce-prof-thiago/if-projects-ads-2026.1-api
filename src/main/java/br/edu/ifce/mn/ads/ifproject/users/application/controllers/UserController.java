package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.ICreateUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final ICreateUser createUser;

    public UserController(ICreateUser createUser) {
        this.createUser = createUser;
    }

    @PostMapping
    public ICreateUser.CreateUserOutput post(@RequestBody ICreateUser.CreateUserInput input) {
        return createUser.execute(input);
    }

}
