package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Component
public class ListArchivedProjects implements IListArchivedProjects {

    private final IProjectRepository projectRepository;

    public ListArchivedProjects(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable) {
        return projectRepository.findArchivedByUser(input, pageable);
    }
}
