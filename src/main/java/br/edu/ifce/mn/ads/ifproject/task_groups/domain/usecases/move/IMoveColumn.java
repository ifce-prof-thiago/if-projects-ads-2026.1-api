package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

public interface IMoveColumn {

    MoveColumnOutput execute(Long id, MoveColumnInput input);

    record MoveColumnInput(
            Long newPosition,
            Long boardId
    ){}

    record MoveColumnOutput(
            Long id
    ){}
}
