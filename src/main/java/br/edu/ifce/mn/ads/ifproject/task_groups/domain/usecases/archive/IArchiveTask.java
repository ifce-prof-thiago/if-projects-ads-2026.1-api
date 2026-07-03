package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import java.util.UUID;

public interface IArchiveTask {

    ArchiveTaskOutput execute(UUID id);

    record ArchiveTaskOutput(
            UUID id
    ) {
    }
}
