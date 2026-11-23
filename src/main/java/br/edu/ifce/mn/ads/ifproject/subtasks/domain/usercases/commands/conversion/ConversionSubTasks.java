package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubTasksRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;

@Component
public class ConversionSubTasks implements IConversionSubTasks {

    ISubTasksRepository repository;

    public ConversionSubTasks(ISubTasksRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void execute(ConvertToTaskInput input) {

        UUID subtaskId = input.subtaskId();

        SearchIdOutput searchIdOutput = repository.findParentTaskInfo(subtaskId)
                .orElseThrow(() -> new ResourceNotFoundException("Subtarefa não encontrada"));

        if(repository.isCompletedSubtask(subtaskId)) {
            throw new BusinessRuleException("Não é possível converter uma subtarefa já concluída");
        }

        int positionConvertedSubtask = repository.getPositionConvertedSubtask(subtaskId);

        repository.persistNewTask(new ISubTasksRepository.NewTask(
                searchIdOutput.task_group_id(),
                searchIdOutput.creator_id(),
                searchIdOutput.assignee_id(),
                input.title(),
                input.description(),
                input.priority().name(),
                repository.lastPositionTask(searchIdOutput.task_group_id()) + 1,
                input.dueDate()
        ));

        repository.removeSubtask(subtaskId);

        repository.updatePositionSubtasksAfterConversion(searchIdOutput.task_id(), positionConvertedSubtask);
    }

}
