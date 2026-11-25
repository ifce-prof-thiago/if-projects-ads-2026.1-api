package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update;

import br.edu.ifce.mn.ads.ifproject.tasks.domain.model.Task;

import java.time.LocalDateTime;
import java.util.UUID;

// "isAchived" (sic) é mantido porque o frontend já depende desse nome.
public record TaskResponse(UUID id, String title, String description, boolean isAchived,
                           String priority, UUID assigneeId, LocalDateTime dueDate) {

    public TaskResponse(Task task) {
        this(task.getId(), task.getTitle(), task.getDescription(), Boolean.TRUE.equals(task.getIsArchived()),
                task.getPriority(), task.getAssigneeId(), task.getDueDate());
    }
}
