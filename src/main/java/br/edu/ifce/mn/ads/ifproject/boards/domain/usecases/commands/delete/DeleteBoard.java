package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

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

        boolean isAuthorized = repository.isUserAuthorizedToDelete(boardId, userId);

        if(!isAuthorized){
            throw new RuntimeException("User is not authorized to delete this board.");
        }

        repository.delete(boardId);

    }
}
