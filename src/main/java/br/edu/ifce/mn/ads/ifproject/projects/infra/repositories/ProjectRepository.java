package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final ListArchivedProjectsSQL listArchivedProjectsSQL;
    private final CreateProjectSQL createProjectSQL;
    private final UpdateProjectSQL updateProjectSQL;
    private final FindProjectSQL findProjectSQL;
    private final ArchiveProjectSQL archiveProjectSQL;
    private final RestoreProjectSQL restoreProjectSQL;
    private final ArchiveBoardsSQL archiveBoardsSQL;
    private final ArchiveTaskGroupsSQL archiveTaskGroupsSQL;
    private final ArchiveTasksSQL archiveTasksSQL;
    private final RestoreBoardsSQL restoreBoardsSQL;
    private final RestoreTaskGroupsSQL restoreTaskGroupsSQL;
    private final RestoreTasksSQL restoreTasksSQL;

    public ProjectRepository(UpdateProjectSQL updateProjectSQL,
                             CreateProjectSQL createProjectSQL,
                             ListArchivedProjectsSQL listArchivedProjectsSQL,
                             FindProjectSQL findProjectSQL,
                             FindProjectSQL findProjectSQL1,
                             ArchiveProjectSQL archiveProjectSQL,
                             RestoreProjectSQL restoreProjectSQL,
                             ArchiveBoardsSQL archiveBoardsSQL,
                             ArchiveTaskGroupsSQL archiveTaskGroupsSQL,
                             ArchiveTasksSQL archiveTasksSQL,
                             RestoreBoardsSQL restoreBoardsSQL,
                             RestoreTaskGroupsSQL restoreTaskGroupsSQL,
                             RestoreTasksSQL restoreTasksSQL) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
        this.createProjectSQL = createProjectSQL;
        this.updateProjectSQL = updateProjectSQL;
        this.findProjectSQL = findProjectSQL1;
        this.archiveProjectSQL = archiveProjectSQL;
        this.restoreProjectSQL = restoreProjectSQL;
        this.archiveBoardsSQL = archiveBoardsSQL;
        this.archiveTaskGroupsSQL = archiveTaskGroupsSQL;
        this.archiveTasksSQL = archiveTasksSQL;
        this.restoreBoardsSQL = restoreBoardsSQL;
        this.restoreTaskGroupsSQL = restoreTaskGroupsSQL;
        this.restoreTasksSQL = restoreTasksSQL;
    }

    @Override
    public UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input){
        return createProjectSQL.execute(ownerId, input);
    }

    @Override
    public void update(UUID id, IUpdateProject.UpdateProjectInput input) {
        updateProjectSQL.execute(id, input);

    }

    public void delete(UUID id){
    }

    @Override
    public Optional<FindProjectOutput> findById(UUID id, UUID userId) {
        return findProjectSQL.execute(id, userId);

    }

    @Override
    public List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    ) {
        return listArchivedProjectsSQL.execute(input, pageable);
    }

    @Override
    public void archive(UUID id) {
        archiveProjectSQL.execute(id);

    }

    @Override
    public void restore(UUID id) {
        restoreProjectSQL.execute(id);

    }

    @Override
    public void archiveBoardsByProjectId(UUID projectId) {
        archiveBoardsSQL.execute(projectId);

    }

    @Override
    public void archiveTaskGroupsByProjectId(UUID projectId) {
        archiveTaskGroupsSQL.execute(projectId);

    }

    @Override
    public void archiveTasksByProjectId(UUID projectId) {
        archiveTasksSQL.execute(projectId);

    }

    @Override
    public void restoreBoardsByProjectId(UUID projectId) {
        restoreBoardsSQL.execute(projectId);

    }

    @Override
    public void restoreTaskGroupsByProjectId(UUID projectId) {
        restoreTaskGroupsSQL.execute(projectId);

    }

    @Override
    public void restoreTasksByProjectId(UUID projectId) {
        restoreTasksSQL.execute(projectId);

    }

}
