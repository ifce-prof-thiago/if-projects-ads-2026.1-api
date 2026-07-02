package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectAlreadyArchivedException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ArchiveProject implements IArchiveProject {

    private final IProjectRepository repository;

    public ArchiveProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    @Transactional
    public ArchiveProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (project.archivedAt() != null) {
            throw new ProjectAlreadyArchivedException(projectId);
        }

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.archive(projectId);
        repository.archiveBoardsByProjectId(projectId);
        repository.archiveTaskGroupsByProjectId(projectId);
        repository.archiveTasksByProjectId(projectId);

        return new ArchiveProjectOutput(projectId, LocalDateTime.now());
    }
}
