package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProjectRepository {

    UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input);

    void update(UUID id, IUpdateProject.UpdateProjectInput input);

    void delete(UUID id);

    Optional<FindProjectOutput> findById(UUID id, UUID userId);

    List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    );

    record FindProjectOutput(
            UUID projectId,
            String name,
            UUID ownerId,
            String role,
            LocalDateTime createdAt,
            LocalDateTime archivedAt
    ) {
    }

    void archive(UUID id);

    void restore(UUID id);

    void archiveBoardsByProjectId(UUID projectId);

    void archiveTaskGroupsByProjectId(UUID projectId);

    void archiveTasksByProjectId(UUID projectId);

    void restoreBoardsByProjectId(UUID projectId);

    void restoreTaskGroupsByProjectId(UUID projectId);

    void restoreTasksByProjectId(UUID projectId);
}
