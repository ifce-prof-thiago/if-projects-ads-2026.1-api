package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class InsufficientPermissionException extends ApiException {

    public InsufficientPermissionException() {
        super(HttpStatus.FORBIDDEN, "Você não tem permissão para realizar esta ação");
    }
}
