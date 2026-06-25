package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CreateProject implements ICreateProject{

    private final IProjectRepository repository;

    public CreateProject(IProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public createProjectOutput execute(createProjectInput input){
        final var id = repository.persist(input);
        // TODO: RN8 — chamar memberRepository.persistOwner(id, input.requesterId())
        return new ICreateProject.createProjectOutput(id);
    }
}

