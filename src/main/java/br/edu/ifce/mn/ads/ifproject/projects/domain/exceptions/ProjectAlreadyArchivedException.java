package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectAlreadyArchivedException extends ApiException {

    public ProjectAlreadyArchivedException(UUID id) {
        super(HttpStatus.CONFLICT, "Este projeto já está arquivado");
    }
}
