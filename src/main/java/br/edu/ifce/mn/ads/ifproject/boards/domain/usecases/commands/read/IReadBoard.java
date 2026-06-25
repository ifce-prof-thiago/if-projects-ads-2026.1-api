package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read;

import java.util.UUID;

public interface IReadBoard {

    ReadBoardOutput execute(ReadBoardInput input);

    record ReadBoardInput(
            UUID id
    ){}

    record ReadBoardOutput(
            String name,
            UUID projectId,
            String hexColor,
            boolean isArchived
    ){}

}
