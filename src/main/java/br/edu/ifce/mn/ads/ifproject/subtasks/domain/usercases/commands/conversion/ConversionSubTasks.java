package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubTasksRepository;
import org.springframework.stereotype.Component;
import java.time.OffsetDateTime;
import java.util.UUID;

@Component
public class ConversionSubTasks implements IConversionSubTasks {

    ISubTasksRepository repository;

    public ConversionSubTasks(ISubTasksRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(ConvertToTaskInput input) {

        UUID subtaskId = input.getSubtaskId();

        SearchIdOutput searchIdOutput = repository.findParentTaskInfo(subtaskId)
                .orElseThrow(() -> new ResourceNotFoundException("Subtask not found"));

        if(repository.isCompletedSubtask(subtaskId)) {
            throw new BusinessRuleException("Subtask já está completada");
        }

        input.setAssignee_id(searchIdOutput.assignee_id());
        input.setTask_group_id(searchIdOutput.task_group_id());
        input.setCreator_id(searchIdOutput.creator_id());

        input.setPosition(repository.lastPositionTask() + 1);
        input.setIs_archived(false);
        input.setCreated_at(OffsetDateTime.now());

        int positionConvertedSubtask = repository.getPositionConvertedSubtask(subtaskId);

        //DISABLE CONVERTED SUBTASK
        repository.removeSubtask(subtaskId);

        //UPDATE SUBTASKS WITH BIGGER POSITIONS THAN CONVERTED SUBTASK
        repository.updatePositionSubtasksAfterConversion(positionConvertedSubtask);

        //CREAT NEW TASK
        repository.persistNewTask(input);
    }

}
