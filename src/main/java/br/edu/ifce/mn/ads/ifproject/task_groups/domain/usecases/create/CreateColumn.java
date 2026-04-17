package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.TaskGroupRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateColumn implements ICreateColumn{

    private final TaskGroupRepository repository;

    public CreateColumn(TaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateColumnOutput execute(CreateColumnInput input) {
        final var id = repository.persist(input);
        return new CreateColumnOutput(id);
    }
}
