package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.archived;
import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.Optional;

@Component
public class ArchivedTask implements IArchivedTask  {
    private final ITaskRepository taskRepository;

    public ArchivedTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(UUID id) {
        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isEmpty()) {
            throw new RuntimeException("Task not found");
        }

        Task task = optionalTask.get();

        task.markAsNotNew();

        task.archived();

        return taskRepository.save(task);

    }

}
