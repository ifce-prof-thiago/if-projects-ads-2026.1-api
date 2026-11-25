package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.list;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface IListColumnsByBoard {

    List<ColumnOutput> execute(UUID boardId);

    record ColumnOutput(
            UUID id,
            String name,
            Long position,
            UUID boardId,
            List<TaskItem> tasks
    ) {
    }

    record ColumnRow(
            UUID id,
            String name,
            Long position,
            UUID boardId
    ) {
    }

    record TaskItem(
            UUID id,
            UUID taskGroupId,
            UUID creatorId,
            UUID assigneeId,
            String title,
            String description,
            String priority,
            Integer position,
            LocalDateTime dueDate,
            boolean isArchived
    ) {
    }
}
