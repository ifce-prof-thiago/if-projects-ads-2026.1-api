package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

@Component
public class ArchiveTask implements IArchiveTask{

    private final ITaskGroupRepository repository;

    public ArchiveTask(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public ArchiveTaskOutput execute(Long id) {
        final var taskId = repository.persist(id);
        return null;
    }
}
