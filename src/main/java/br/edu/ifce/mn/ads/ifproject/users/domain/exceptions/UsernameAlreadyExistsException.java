package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class UsernameAlreadyExistsException extends ApiException {
    public UsernameAlreadyExistsException() {
        super(HttpStatus.CONFLICT, "Este nome de usuário já está em uso");
    }
}
