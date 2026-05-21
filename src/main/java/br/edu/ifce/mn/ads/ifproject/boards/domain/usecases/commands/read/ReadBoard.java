package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class ReadBoard implements IReadBoard{

    private final IBoardRepository repository;

    public ReadBoard(IBoardRepository repository){this.repository = repository;}

    @Override
    public ReadBoardOutput execute(ReadBoardInput input) {

        final var board = repository.find(input);

        return board;
    }
}
