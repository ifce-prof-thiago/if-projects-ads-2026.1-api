package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveBoard implements IArchiveBoard {

    private final IBoardRepository repository;

    public ArchiveBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public ArchiveBoardOutput execute(UUID id) {
        return repository.setArchived(id, true)
                .orElseThrow(() -> new NotFoundException("Board not found: " + id));
    }
}
