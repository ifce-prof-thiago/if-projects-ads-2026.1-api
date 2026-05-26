package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.find_project;

import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IFindProject {

    FindProjectOutput execute (UUID projectId, UUID requesterId);

    record FindProjectOutput(
            UUID id,
            String name,
            UUID ownerId,
            LocalDateTime createdAt,
            LocalDateTime archivedAt
    ){
    }
}
