package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.restore;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreBoard implements IRestoreBoard {

    private final IBoardRepository repository;

    public RestoreBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public IArchiveBoard.ArchiveBoardOutput execute(UUID id) {
        return repository.setArchived(id, false)
                .orElseThrow(() -> new NotFoundException("Board not found: " + id));
    }
}
