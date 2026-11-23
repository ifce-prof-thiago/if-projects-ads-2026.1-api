package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IRefreshSession;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Endpoints de autenticação destinados a clientes web e mobile. */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final IAuthenticateUser authenticateUser;
    private final IRefreshSession refreshSession;

    public AuthController(IAuthenticateUser authenticateUser, IRefreshSession refreshSession) {
        this.authenticateUser = authenticateUser;
        this.refreshSession = refreshSession;
    }

    @PostMapping("/login")
    public IAuthenticateUser.AuthenticateUserOutput login(
            @RequestBody @Valid IAuthenticateUser.AuthenticateUserInput input
    ) {
        return authenticateUser.execute(input);
    }

    @PostMapping("/refresh")
    public IAuthenticateUser.AuthenticateUserOutput refresh(
            @RequestBody @Valid IRefreshSession.RefreshSessionInput input
    ) {
        return refreshSession.execute(input);
    }
}
