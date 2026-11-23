package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MemberNotFoundException extends ApiException {

    public MemberNotFoundException(UUID userId) {
        super(HttpStatus.NOT_FOUND, "Membro não encontrado neste projeto");
    }
}
