package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class BoardNotFoundException extends ApiException {
    public BoardNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Quadro não encontrado");
    }
}
