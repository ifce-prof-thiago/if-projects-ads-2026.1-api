package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubtaskRepository;
import org.springframework.stereotype.Component;
import java.time.OffsetDateTime;
import java.util.UUID;

@Component
public class ConversionSubTasks implements IConversionSubTasks {

    ISubtaskRepository repository;

    public ConversionSubTasks(ISubtaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(ConversionSubtaskInput input) {

        UUID subtaskId = input.subtaskId();

        SearchIdOutput searchIdOutput = repository.findParentTaskInfo(subtaskId)
                .orElseThrow(() -> new ResourceNotFoundException("Subtask not found"));

        if(repository.isCompletedSubtask(subtaskId)) {
            throw new BusinessRuleException("Subtask já está completada");
        }

        final ISubtaskRepository.ConvertToTaskInput newTask = new ISubtaskRepository.ConvertToTaskInput(
                searchIdOutput.task_group_id(),
                searchIdOutput.creator_id(),
                searchIdOutput.assignee_id(),
                searchIdOutput.description(),
                repository.lastPositionTask() + 1,
                false,
                OffsetDateTime.now());

        int positionConvertedSubtask = repository.getPositionConvertedSubtask(subtaskId);

        //DISABLE CONVERTED SUBTASK
        repository.removeSubtask(subtaskId);

        //UPDATE SUBTASKS WITH BIGGER POSITIONS THAN CONVERTED SUBTASK
        repository.updatePositionSubtasksAfterConversion(positionConvertedSubtask, searchIdOutput.task_id());

        //CREAT NEW TASK
        repository.persistNewTask(newTask);
    }

}
