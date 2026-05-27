package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateBoard implements ICreateBoard{

    private final IBoardRepository repository;

    public CreateBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateBoardOutput execute(CreateBoardInput input) {

        final var id = repository.persist(input);

        return new CreateBoardOutput(id);
    }
}
