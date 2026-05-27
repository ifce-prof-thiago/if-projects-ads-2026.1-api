package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateBoard implements IUpdateBoard{

    private final IBoardRepository repository;

    public UpdateBoard(IBoardRepository repository) {
        this.repository = repository;
    }


    @Override
    public UpdateBoardOutput execute(UUID id, UpdateBoardInput input) {
        final var boardId = repository.update(id, input);

        return new UpdateBoardOutput(boardId);
    }
}
