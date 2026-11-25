package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
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
            throw new NotFoundException("Board not found: " + boardId);
        }

        boolean isAuthorized = repository.isUserAuthorizedToDelete(boardId, userId);

        if(!isAuthorized){
            throw new InsufficientPermissionException();
        }

        repository.delete(boardId);

    }
}
