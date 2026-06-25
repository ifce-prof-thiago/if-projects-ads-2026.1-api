package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.create;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CreateTask implements ICreateTask {

    private final ITaskRepository taskRepository;

    public CreateTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(Task task) {
        task.setId(UUID.randomUUID());
        task.setIsArchived(false);
        task.setCreatedAt(LocalDateTime.now());

        Task savedTask = taskRepository.save(task);

        savedTask.markAsNotNew();

        return savedTask;
    }
}