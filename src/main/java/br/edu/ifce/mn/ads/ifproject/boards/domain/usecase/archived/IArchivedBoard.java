package br.edu.ifce.mn.ads.ifproject.board.domain.usecase.archived;

import br.edu.ifce.mn.ads.ifproject.board.domain.model.Board;
import java.util.UUID;

public interface IArchivedBoard {
    Board execute(UUID id);
}