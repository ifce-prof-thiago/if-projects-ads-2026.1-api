package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class InvalidCurrentPasswordException extends ApiException {
    public InvalidCurrentPasswordException() {
        super(HttpStatus.BAD_REQUEST, "A senha atual não confere");
    }
}
