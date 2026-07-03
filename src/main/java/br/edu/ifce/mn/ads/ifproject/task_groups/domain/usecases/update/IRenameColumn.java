package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

import java.util.UUID;

public interface IRenameColumn {

    RenameColumnOutput execute(UUID id, RenameColumnInput input);

    record RenameColumnInput(
            String name
    ){

    }
    record RenameColumnOutput(
        UUID id
    ){

    }
}
