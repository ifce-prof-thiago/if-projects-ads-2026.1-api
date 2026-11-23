package br.edu.ifce.mn.ads.ifproject.task.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class TaskNotFoundException extends ApiException {
    public TaskNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
    }
}
