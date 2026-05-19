package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Validated
public interface IListArchivedProjects {

    ListArchivedProjectsOutput execute(@Valid ListArchivedProjectsInput input);

    record ListArchivedProjectsInput( UUID userId){}

    record ProjectList(UUID id, String name, LocalDateTime archivedAt){}

    record ListArchivedProjectsOutput(List<ProjectList> archivedProjects) {}

}
