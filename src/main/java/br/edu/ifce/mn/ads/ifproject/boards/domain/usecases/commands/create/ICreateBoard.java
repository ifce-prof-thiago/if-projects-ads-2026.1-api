package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create;

import java.util.UUID;

public interface ICreateBoard {

    CreateBoardOutput execute(CreateBoardInput input);

    record CreateBoardInput(
            String name,
            UUID projectId
    )
    {}

    record CreateBoardOutput(
            UUID id
    )
    {}

}
