package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;

import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateTask implements IUpdateTask {

    private final ITaskRepository taskRepository;

    public UpdateTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Override
    public TaskResponse  execute(UUID id, UpdateTaskRequest request) {

        var task = taskRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Task not found"));
        task.markAsNotNew();

        task.update(request.title(), request.description());

        taskRepository.save(task);

        return new TaskResponse(task);

    }

}


