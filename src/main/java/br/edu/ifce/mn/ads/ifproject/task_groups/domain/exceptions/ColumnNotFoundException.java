package br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class ColumnNotFoundException extends ApiException {
    public ColumnNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Coluna não encontrada");
    }
}
