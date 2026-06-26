package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotArchivedException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class RestoreProject implements IRestoreProject {

    private final IProjectRepository repository;

    public RestoreProject(IProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public RestoreProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (project.archivedAt() == null) {
            throw new ProjectNotArchivedException(projectId);
        }

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.restore(projectId);
        repository.restoreBoardsByProjectId(projectId);
        repository.restoreTaskGroupsByProjectId(projectId);
        repository.restoreTasksByProjectId(projectId);

        return new RestoreProjectOutput(projectId);
    }
}
