package br.edu.ifce.mn.ads.ifproject.users.application.controllers.api;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ICreateUserApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation
    ICreateUser.CreateUserOutput post(@RequestBody ICreateUser.CreateUserInput input);

}
