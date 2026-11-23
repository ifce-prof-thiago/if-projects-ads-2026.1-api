package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class CannotTransferToNonMemberException extends ApiException {

    public CannotTransferToNonMemberException(UUID userId) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, "Só é possível transferir o projeto para um membro");
    }
}
