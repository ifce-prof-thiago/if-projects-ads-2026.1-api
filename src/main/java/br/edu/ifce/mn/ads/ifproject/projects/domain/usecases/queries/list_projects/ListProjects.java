package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListProjects implements IListProjects {

    private final IProjectRepository repository;

    public ListProjects(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public List<IProjectRepository.ListProjectsOutput> execute(Pageable pageable) {
        final var userId = UserLogged.id();
        return repository.findAllByUserId(userId, pageable);
    }
}