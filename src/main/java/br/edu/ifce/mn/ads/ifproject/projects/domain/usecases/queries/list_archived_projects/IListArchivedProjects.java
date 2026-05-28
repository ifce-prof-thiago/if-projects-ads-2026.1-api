package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects;

import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Validated
public interface IListArchivedProjects {

    List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable);

    record ListArchivedProjectsInput(UUID userId, Pageable pageable) {
    }

    record IListArchivedProjectsOutput(UUID id, String name, LocalDateTime archivedAt) {
    }


}
