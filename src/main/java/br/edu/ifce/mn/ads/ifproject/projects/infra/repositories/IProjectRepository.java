package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;

public interface IProjectRepository {

    IListArchivedProjects.ListArchivedProjectsOutput findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input
    );

}
