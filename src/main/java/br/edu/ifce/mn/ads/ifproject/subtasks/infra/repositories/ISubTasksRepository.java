package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.SearchIdOutput;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface ISubTasksRepository {

    UUID persistNewTask(NewTask input);

    Optional<SearchIdOutput> findParentTaskInfo(UUID id);

    void removeSubtask(UUID id);

    int lastPositionTask(UUID taskGroupId);

    boolean isCompletedSubtask(UUID id);

    void updatePositionSubtasksAfterConversion(UUID taskId, int position);

    int getPositionConvertedSubtask(UUID id);

    record NewTask(
            UUID taskGroupId,
            UUID creatorId,
            UUID assigneeId,
            String title,
            String description,
            String priority,
            int position,
            OffsetDateTime dueDate
    ) {
    }

}
