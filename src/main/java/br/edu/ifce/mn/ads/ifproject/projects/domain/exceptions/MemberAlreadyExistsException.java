package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MemberAlreadyExistsException extends ApiException {

    public MemberAlreadyExistsException(UUID projectId, UUID userId) {
        super(HttpStatus.CONFLICT, "Este membro já está no projeto");
    }
}
