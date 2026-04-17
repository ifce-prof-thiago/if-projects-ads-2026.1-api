package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete;


import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class DeleteColumn implements IDeleteColumn {

    private final ITaskGroupRepository repository;

    public DeleteColumn(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public IDeleteColumnOutput execute(Long id) {
        final var columnId = repository.delete(id);
        return new IDeleteColumnOutput(columnId);
    }
}

