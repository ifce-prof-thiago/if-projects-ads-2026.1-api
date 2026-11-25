package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class DuplicateBoard implements IDuplicateBoard{

    private final IBoardRepository repository;

    public DuplicateBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public DuplicateBoardOutput execute(DuplicateBoardInput input) {


        if (!repository.exists(input.originalBoardId())) {
            throw new NotFoundException("Board not found: " + input.originalBoardId());
        }

        UUID newBoardId = repository.duplicateBoardData(input.originalBoardId(), input.newBoardName());

        repository.duplicateTaskGroups(input.originalBoardId(), newBoardId);

        return new DuplicateBoardOutput(newBoardId);
    }
}
