package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IArchiveProject {

    ArchiveProjectOutput execute(UUID projectId);

    record ArchiveProjectOutput(UUID id, LocalDateTime archivedAt) {
    }
}
