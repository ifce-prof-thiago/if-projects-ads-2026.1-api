package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectNotFoundException extends ApiException {

    public ProjectNotFoundException(UUID id) {
        super(HttpStatus.NOT_FOUND, "Projeto não encontrado");
    }
}
