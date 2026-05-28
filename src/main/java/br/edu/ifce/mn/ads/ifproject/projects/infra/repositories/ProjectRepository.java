package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project.IFindProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.CreateProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.FindProjectSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.ListArchivedProjectsSQL;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.UpdateProjectSQL;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final ListArchivedProjectsSQL listArchivedProjectsSQL;
    private final CreateProjectSQL createProjectSQL;
    private final UpdateProjectSQL updateProjectSQL;
    private final FindProjectSQL findProjectSQL;

    public ProjectRepository(UpdateProjectSQL updateProjectSQL, CreateProjectSQL createProjectSQL, ListArchivedProjectsSQL listArchivedProjectsSQL, FindProjectSQL findProjectSQL, FindProjectSQL findProjectSQL1) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
        this.createProjectSQL = createProjectSQL;
        this.updateProjectSQL = updateProjectSQL;
        this.findProjectSQL = findProjectSQL1;
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
    public Optional<IFindProject.FindProjectOutput> findById(UUID id) {
        return findProjectSQL.execute(id);
    }

    @Override
    public List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    ) {
        return listArchivedProjectsSQL.execute(input, pageable);
    }

}
