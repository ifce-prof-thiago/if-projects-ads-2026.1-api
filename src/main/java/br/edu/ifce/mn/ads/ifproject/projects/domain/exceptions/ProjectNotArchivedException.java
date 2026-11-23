package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectNotArchivedException extends ApiException {

    public ProjectNotArchivedException(UUID id) {
        super(HttpStatus.CONFLICT, "Este projeto não está arquivado");
    }
}
