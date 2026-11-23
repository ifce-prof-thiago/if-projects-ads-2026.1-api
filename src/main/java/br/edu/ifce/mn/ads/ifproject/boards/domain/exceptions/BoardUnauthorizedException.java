package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class BoardUnauthorizedException extends ApiException {
    public BoardUnauthorizedException() {
        super(HttpStatus.FORBIDDEN, "Você não tem permissão para excluir este quadro");
    }
}
