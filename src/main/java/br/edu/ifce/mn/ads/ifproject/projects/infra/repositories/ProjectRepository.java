package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ListArchivedProjectsSQL;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final ListArchivedProjectsSQL listArchivedProjectsSQL;

    public ProjectRepository(ListArchivedProjectsSQL listArchivedProjectsSQL) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
    }


    @Override
    public List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input
    ) {
        return listArchivedProjectsSQL.execute(input);
    }

    @Override
    public UUID update(UUID projectId, IUpdateProject.UpdateProjectInput input) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public UUID persist(ICreateProject.createProjectInput input) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
