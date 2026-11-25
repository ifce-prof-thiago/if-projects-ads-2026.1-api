package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTask implements IArchiveTask{

    private final ITaskGroupRepository repository;

    public ArchiveTask(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public ArchiveTaskOutput execute(UUID id) {
        if (repository.findPositionById(id).isEmpty()) {
            throw new NotFoundException("Task group not found: " + id);
        }
        final var taskGroupId = repository.persist(id);
        return new ArchiveTaskOutput(taskGroupId);
    }
}
