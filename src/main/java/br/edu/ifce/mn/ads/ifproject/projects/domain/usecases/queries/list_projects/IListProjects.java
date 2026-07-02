package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IListProjects {

    List<IProjectRepository.ListProjectsOutput> execute(Pageable pageable);
}