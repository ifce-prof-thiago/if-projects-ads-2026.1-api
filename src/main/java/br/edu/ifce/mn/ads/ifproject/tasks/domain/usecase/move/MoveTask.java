package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.move;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.BadRequestException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.tasks.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Move a tarefa dentro da coluna ou para outra coluna, no mesmo padrão do
 * /task_group/{id}/move: as demais tarefas são deslocadas para manter as posições contíguas.
 */
@Service
public class MoveTask implements IMoveTask {

    private final ITaskRepository taskRepository;

    public MoveTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    @Transactional
    public MoveTaskOutput execute(UUID id, MoveTaskInput input) {
        if (input.taskGroupId() == null || input.newPosition() == null) {
            throw new BadRequestException("taskGroupId e newPosition são obrigatórios");
        }
        if (input.newPosition() < 0) {
            throw new BadRequestException("newPosition deve ser maior ou igual a 0");
        }

        final var task = taskRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Task not found: " + id));

        if (!taskRepository.taskGroupExists(input.taskGroupId())) {
            throw new NotFoundException("Task group not found: " + input.taskGroupId());
        }

        final UUID fromGroup = task.getTaskGroupId();
        final int fromPosition = task.getPosition();
        final UUID toGroup = input.taskGroupId();
        final int toPosition = input.newPosition();

        if (toGroup.equals(fromGroup)) {
            if (toPosition == fromPosition) {
                return new MoveTaskOutput(id, toGroup, toPosition);
            }
            if (toPosition < fromPosition) {
                taskRepository.incrementPositions(toGroup, toPosition, fromPosition);
            } else {
                taskRepository.decrementPositions(toGroup, fromPosition, toPosition);
            }
        } else {
            // Fecha o buraco na coluna de origem e abre espaço na de destino.
            taskRepository.decrementPositions(fromGroup, fromPosition, Integer.MAX_VALUE);
            taskRepository.incrementPositions(toGroup, toPosition, Integer.MAX_VALUE);
        }

        task.markAsNotNew();
        task.setTaskGroupId(toGroup);
        task.setPosition(toPosition);
        taskRepository.save(task);

        return new MoveTaskOutput(id, toGroup, toPosition);
    }
}
