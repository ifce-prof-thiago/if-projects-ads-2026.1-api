package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project.IFindProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProjectRepository {

    UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input);

    void update(UUID id, IUpdateProject.UpdateProjectInput input);

    void delete(UUID id);

    Optional<IFindProject.FindProjectOutput> findById(UUID id);


    List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    );
}
