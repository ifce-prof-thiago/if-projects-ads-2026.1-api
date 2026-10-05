package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CreateProject implements ICreateProject {

    private final ICreateProjectGateway createProjectGateway;

    public CreateProject(ICreateProjectGateway createProjectGateway) {
        this.createProjectGateway = createProjectGateway;
    }

    @Override
    @Transactional
    public CreateProjectOutput execute(CreateProjectInput input) {
        final var ownerId = UserLogged.id();
        final var id = createProjectGateway.persist(ownerId, input);
        return new CreateProjectOutput(id);
    }
}

