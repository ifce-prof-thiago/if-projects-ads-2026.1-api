package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record SubtaskResponse(
        UUID id,
        UUID taskId,
        String description,
        int position,
        boolean completed,
        OffsetDateTime createdAt
) {
}
