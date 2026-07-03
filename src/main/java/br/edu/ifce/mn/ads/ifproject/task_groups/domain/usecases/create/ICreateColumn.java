package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

import java.util.UUID;

public interface ICreateColumn {
    CreateColumnOutput execute(CreateColumnInput input);

    record CreateColumnInput(
            String name,
            Long position,
            UUID boardId
    ){

    }
    record CreateColumnOutput(
            UUID id
    ){

    }
}
