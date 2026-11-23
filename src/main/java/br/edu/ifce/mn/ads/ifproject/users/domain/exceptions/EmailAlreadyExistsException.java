package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends ApiException {
    public EmailAlreadyExistsException() {
        super(HttpStatus.CONFLICT, "Este e-mail já está em uso");
    }
}
