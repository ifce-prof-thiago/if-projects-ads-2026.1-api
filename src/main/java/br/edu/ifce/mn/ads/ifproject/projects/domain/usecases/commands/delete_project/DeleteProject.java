package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteProject implements IDeleteProject {

    private final IProjectRepository repository;

    public DeleteProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public DeleteProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.delete(projectId);
        return new DeleteProjectOutput(projectId);
    }
}