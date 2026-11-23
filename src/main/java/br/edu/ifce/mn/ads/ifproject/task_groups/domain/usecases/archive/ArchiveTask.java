package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
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
        if (!repository.exists(id)) {
            throw new ColumnNotFoundException();
        }
        repository.persist(id);
        return new ArchiveTaskOutput(id);
    }
}
