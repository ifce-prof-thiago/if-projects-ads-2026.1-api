package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RenameColumn implements IRenameColumn{

    private final ITaskGroupRepository repository;

    public RenameColumn(ITaskGroupRepository repository) {
        this.repository = repository;
    }


    @Override
    public IRenameColumn.RenameColumnOutput execute(UUID id, RenameColumnInput input){
        final var columnId = repository.persist(id, input);
        return new RenameColumnOutput(columnId);
    }
}
