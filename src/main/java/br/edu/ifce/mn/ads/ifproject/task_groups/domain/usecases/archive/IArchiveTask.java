package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

public interface IArchiveTask {

    ArchiveTaskOutput execute(Long id);

    record ArchiveTaskOutput(
            Long id
    ) {
    }
}
