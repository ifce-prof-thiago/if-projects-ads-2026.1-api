package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.CreateProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.FindProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ListArchivedProjectsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.UpdateProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ArchiveBoardsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ArchiveProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ArchiveTaskGroupsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ArchiveTasksSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.FindOwnerIdSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.RestoreBoardsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.RestoreProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.RestoreTaskGroupsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.RestoreTasksSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.TransferOwnershipSQL;
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
    private final DeleteProjectSQL deleteProjectSQL;
    private final FindProjectSQL findProjectSQL;
    private final ListProjectsSQL listProjectsSQL;
    private final ArchiveProjectSQL archiveProjectSQL;
    private final RestoreProjectSQL restoreProjectSQL;
    private final ArchiveBoardsSQL archiveBoardsSQL;
    private final ArchiveTaskGroupsSQL archiveTaskGroupsSQL;
    private final ArchiveTasksSQL archiveTasksSQL;
    private final RestoreBoardsSQL restoreBoardsSQL;
    private final RestoreTaskGroupsSQL restoreTaskGroupsSQL;
    private final RestoreTasksSQL restoreTasksSQL;
    private final FindOwnerIdSQL findOwnerIdSQL;
    private final TransferOwnershipSQL transferOwnershipSQL;

    public ProjectRepository(UpdateProjectSQL updateProjectSQL,
                             CreateProjectSQL createProjectSQL,
                             ListArchivedProjectsSQL listArchivedProjectsSQL,
                             FindProjectSQL findProjectSQL, DeleteProjectSQL deleteProjectSQL,
                             FindProjectSQL findProjectSQL1, ListProjectsSQL listProjectsSQL,
                             ArchiveProjectSQL archiveProjectSQL,
                             RestoreProjectSQL restoreProjectSQL,
                             ArchiveBoardsSQL archiveBoardsSQL,
                             ArchiveTaskGroupsSQL archiveTaskGroupsSQL,
                             ArchiveTasksSQL archiveTasksSQL,
                             RestoreBoardsSQL restoreBoardsSQL,
                             RestoreTaskGroupsSQL restoreTaskGroupsSQL,
                             RestoreTasksSQL restoreTasksSQL,
                             FindOwnerIdSQL findOwnerIdSQL,
                             TransferOwnershipSQL transferOwnershipSQL
                             ) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
        this.createProjectSQL = createProjectSQL;
        this.updateProjectSQL = updateProjectSQL;
        this.deleteProjectSQL = deleteProjectSQL;
        this.findProjectSQL = findProjectSQL1;
        this.listProjectsSQL = listProjectsSQL;
        this.archiveProjectSQL = archiveProjectSQL;
        this.restoreProjectSQL = restoreProjectSQL;
        this.archiveBoardsSQL = archiveBoardsSQL;
        this.archiveTaskGroupsSQL = archiveTaskGroupsSQL;
        this.archiveTasksSQL = archiveTasksSQL;
        this.restoreBoardsSQL = restoreBoardsSQL;
        this.restoreTaskGroupsSQL = restoreTaskGroupsSQL;
        this.restoreTasksSQL = restoreTasksSQL;
        this.findOwnerIdSQL = findOwnerIdSQL;
        this.transferOwnershipSQL = transferOwnershipSQL;

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
        deleteProjectSQL.execute(id);
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

    @Override
    public List<ListProjectsOutput> findAllByUserId(UUID userId, Pageable pageable) {
        return listProjectsSQL.execute(userId, pageable);
    }

    @Override
    public UUID findOwnerId(UUID projectId) {
        return findOwnerIdSQL.execute(projectId);
    }

    @Override
    public void transferOwnership(UUID projectId, UUID newOwnerId) {
        transferOwnershipSQL.execute(projectId, newOwnerId);
    }

}
