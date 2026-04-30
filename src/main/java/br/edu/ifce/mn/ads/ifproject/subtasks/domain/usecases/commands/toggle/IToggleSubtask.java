package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle;

import java.util.UUID;

public interface IToggleSubtask {
    ToggleSubtaskOutput execute(UUID id);

    record ToggleSubtaskOutput(
            String id,
            boolean isCompleted
    ) {
    }
}