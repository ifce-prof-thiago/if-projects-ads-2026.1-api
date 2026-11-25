package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FindArchivedBoardsByProject implements IFindArchivedBoardsByProject {

    private final IBoardRepository repository;

    public FindArchivedBoardsByProject(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public IFindBoardsByProject.FindBoardsByProjectOutput execute(UUID projectId) {
        return new IFindBoardsByProject.FindBoardsByProjectOutput(repository.findArchivedByProjectId(projectId));
    }
}
