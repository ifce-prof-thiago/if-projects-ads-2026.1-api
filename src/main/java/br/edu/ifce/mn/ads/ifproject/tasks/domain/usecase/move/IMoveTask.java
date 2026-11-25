package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.move;

import java.util.UUID;

public interface IMoveTask {

    MoveTaskOutput execute(UUID id, MoveTaskInput input);

    record MoveTaskInput(
            UUID taskGroupId,
            Integer newPosition
    ) {
    }

    record MoveTaskOutput(
            UUID id,
            UUID taskGroupId,
            Integer position
    ) {
    }
}
