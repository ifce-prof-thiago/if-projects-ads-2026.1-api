package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.CreateProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ListArchivedProjectsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.UpdateProjectSQL;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final ListArchivedProjectsSQL listArchivedProjectsSQL;
    private final CreateProjectSQL createProjectSQL;
    private final UpdateProjectSQL updateProjectSQL;

    public ProjectRepository(UpdateProjectSQL updateProjectSQL, CreateProjectSQL createProjectSQL, ListArchivedProjectsSQL listArchivedProjectsSQL) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
        this.createProjectSQL = createProjectSQL;
        this.updateProjectSQL = updateProjectSQL;
    }

    @Override
    public UUID persist(ICreateProject.createProjectInput input){
        return createProjectSQL.execute(input);
    }

    @Override
    public UUID update(UUID id, IUpdateProject.UpdateProjectInput input) {
        updateProjectSQL.execute(id, input);

        return id;
    }

    @Override
    public List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    ) {
        return listArchivedProjectsSQL.execute(input, pageable);
    }

}
