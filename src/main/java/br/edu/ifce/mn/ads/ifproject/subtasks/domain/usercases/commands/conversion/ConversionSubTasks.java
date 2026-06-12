package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubTasksRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.UUID;

@Component
public class ConversionSubTasks implements IConversionSubTasks {

    ISubTasksRepository repository;

    public ConversionSubTasks(ISubTasksRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void execute(ConversionSubTasksInput input) {

        final var subtaskId = input.subtaskId();

        final var searchIdOutput = repository.findParentTaskInfo(subtaskId)
                .orElseThrow(() -> new ResourceNotFoundException("Subtask not found"));

        if (repository.isCompletedSubtask(subtaskId)) {
            throw new BusinessRuleException("Subtask já está completada");
        }

        final var newTask = new ISubTasksRepository.ConvertToTaskInput(
                searchIdOutput.task_group_id(),
                searchIdOutput.creator_id(),
                searchIdOutput.assignee_id(),
                searchIdOutput.description(),
                repository.lastPositionTask() + 1,
                false,
                OffsetDateTime.now()
        );

        int positionConvertedSubtask = repository.getPositionConvertedSubtask(subtaskId);

        //DISABLE CONVERTED SUBTASK
        repository.removeSubtask(subtaskId);

        //UPDATE SUBTASKS WITH BIGGER POSITIONS THAN CONVERTED SUBTASK
        repository.updatePositionSubtasksAfterConversion(positionConvertedSubtask);

        //CREATE NEW TASK
        repository.persistNewTask(newTask); // TODO utilizar o repositório de tasks
    }

}
