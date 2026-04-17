package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

public interface IRenameColumn {

    RenameColumnOutput execute(Long id, RenameColumnInput input);

    record RenameColumnInput(
            String name
    ){

    }
    record RenameColumnOutput(
        Long id
    ){

    }
}
