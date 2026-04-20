package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

public interface ICreateColumn {
    CreateColumnOutput execute(CreateColumnInput input);

    record CreateColumnInput(
            String name,
            Long position,
            Long boardId
    ){

    }
    record CreateColumnOutput(
            Long id
    ){

    }
}
