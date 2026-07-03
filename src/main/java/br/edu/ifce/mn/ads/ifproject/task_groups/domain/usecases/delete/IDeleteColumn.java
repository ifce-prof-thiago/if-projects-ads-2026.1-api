package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete;

import java.util.UUID;

public interface IDeleteColumn {
    IDeleteColumnOutput execute(UUID id);

    record IDeleteColumnOutput(
            UUID id
    ) {
    }
}
