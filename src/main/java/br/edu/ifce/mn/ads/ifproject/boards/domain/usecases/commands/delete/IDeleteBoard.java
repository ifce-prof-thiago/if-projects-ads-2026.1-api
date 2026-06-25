package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

import java.util.UUID;

public interface IDeleteBoard {

    void execute(UUID boardId, UUID userId);

}
