package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects;

import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Validated
public interface IListArchivedProjects {

    List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input);

    record ListArchivedProjectsInput(UUID userId, Integer page, Integer perPage) {
    }

    record IListArchivedProjectsOutput(UUID id, String name, LocalDateTime archivedAt) {
    }

}
