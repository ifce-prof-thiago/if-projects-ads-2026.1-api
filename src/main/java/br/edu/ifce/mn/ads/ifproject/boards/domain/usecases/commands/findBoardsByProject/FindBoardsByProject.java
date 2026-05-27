package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class FindBoardsByProject implements IFindBoardsByProject{

    private final IBoardRepository repository;

    public FindBoardsByProject(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public FindBoardsByProjectOutput execute(FindBoardsByProjectInput input) {

        var boards = repository.findByProjectId(input.projectId());

        return new FindBoardsByProjectOutput(boards);
    }

}
