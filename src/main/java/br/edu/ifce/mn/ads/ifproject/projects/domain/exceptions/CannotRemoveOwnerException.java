package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class CannotRemoveOwnerException extends ApiException {

    public CannotRemoveOwnerException() {
        super(HttpStatus.UNPROCESSABLE_ENTITY, "Não é possível remover o dono do projeto");
    }
}
