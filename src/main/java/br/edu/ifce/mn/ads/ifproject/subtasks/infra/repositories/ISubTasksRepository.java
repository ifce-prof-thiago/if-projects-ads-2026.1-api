package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.SearchIdOutput;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface ISubTasksRepository {

    UUID persistNewTask(ConvertToTaskInput input);

    Optional<SearchIdOutput> findParentTaskInfo(UUID id);

    void removeSubtask(UUID id);

    int lastPositionTask();

    boolean isCompletedSubtask(UUID id);

    void updatePositionSubtasksAfterConversion(int position);

    int getPositionConvertedSubtask(UUID id);

}
