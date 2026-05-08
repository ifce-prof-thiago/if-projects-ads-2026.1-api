package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class UpdateProject implements IUpdateProject {

    private final IProjectRepository repository;

    public UpdateProject(IProjectRepository repository) {
        this.repository = repository;
    }


    @Override
    public UpdateProjectOutput execute(UUID projectId, UUID requesterID, UpdateProjectInput input) {
        final var updatedProjId = repository.update(projectId, input);
        return new UpdateProjectOutput(updatedProjId);
    }
}
