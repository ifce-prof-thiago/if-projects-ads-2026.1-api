package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

import java.util.UUID;

public interface IMoveColumn {

    MoveColumnOutput execute(UUID id, MoveColumnInput input);

    record MoveColumnInput(
            Long newPosition,
            UUID boardId
    ){}

    record MoveColumnOutput(
            UUID id
    ){}
}
