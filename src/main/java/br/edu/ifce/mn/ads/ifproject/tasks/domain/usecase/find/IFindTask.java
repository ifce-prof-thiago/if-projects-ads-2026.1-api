package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.find;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.model.SubtarefaDTOoutput;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface IFindTask {

    TaskDetailResponse execute(UUID id);

    record TaskDetailResponse(
            UUID id,
            UUID taskGroupId,
            UUID creatorId,
            UUID assigneeId,
            String title,
            String description,
            String priority,
            Integer position,
            LocalDateTime dueDate,
            boolean isArchived,
            LocalDateTime createdAt,
            List<SubtarefaDTOoutput> subtasks
    ) {
    }
}
