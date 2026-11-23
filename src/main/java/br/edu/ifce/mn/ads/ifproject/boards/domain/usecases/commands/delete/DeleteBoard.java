package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardUnauthorizedException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteBoard implements IDeleteBoard{

    private final IBoardRepository repository;

    public DeleteBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(UUID boardId, UUID userId) {
        if (!repository.exists(boardId)) {
            throw new BoardNotFoundException();
        }

        if (!repository.isUserAuthorizedToDelete(boardId, userId)) {
            throw new BoardUnauthorizedException();
        }

        repository.delete(boardId);
    }
}
