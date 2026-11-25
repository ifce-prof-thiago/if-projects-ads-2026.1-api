package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.find;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.SubtaskRepository;
import br.edu.ifce.mn.ads.ifproject.tasks.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindTask implements IFindTask {

    private final ITaskRepository taskRepository;
    private final SubtaskRepository subtaskRepository;

    public FindTask(ITaskRepository taskRepository, SubtaskRepository subtaskRepository) {
        this.taskRepository = taskRepository;
        this.subtaskRepository = subtaskRepository;
    }

    @Override
    public TaskDetailResponse execute(UUID id) {
        final var task = taskRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Task not found: " + id));

        return new TaskDetailResponse(
                task.getId(),
                task.getTaskGroupId(),
                task.getCreatorId(),
                task.getAssigneeId(),
                task.getTitle(),
                task.getDescription(),
                task.getPriority(),
                task.getPosition(),
                task.getDueDate(),
                Boolean.TRUE.equals(task.getIsArchived()),
                task.getCreatedAt(),
                subtaskRepository.listarPorTarefa(id)
        );
    }
}
