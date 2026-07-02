package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
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
    public UpdateProjectOutput execute(UUID projectId, UpdateProjectInput input) {
        final var usrId = UserLogged.id();
        final var project = repository.findById(projectId, usrId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.update(projectId, input);
        return new UpdateProjectOutput(projectId);
    }
}
