package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateProject implements ICreateProject{

    private final IProjectRepository repository;

    public CreateProject(IProjectRepository repository) {
        this.repository = repository;
    }

    public createProjectOutput execute(createProjectInput input){
        final var id = repository.persist(input);
        return new ICreateProject.createProjectOutput(id);
    }
}

