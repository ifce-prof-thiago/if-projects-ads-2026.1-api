package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.TaskGroupRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class MoveColumn implements IMoveColumn {

    private final TaskGroupRepository repository;

    public MoveColumn(TaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public MoveColumnOutput execute(UUID id, MoveColumnInput input) {
        final Long currentPosition = repository.findPositionById(id);

        if(currentPosition.equals(input.newPosition())){
            return new MoveColumnOutput(id);
        }

        if(input.newPosition() < currentPosition){
            repository.incrementPositions(
                    input.boardId(),
                    input.newPosition(),
                    currentPosition
            );
        } else {
            repository.decrementPositions(
                    input.boardId(),
                    input.newPosition(),
                    currentPosition
            );
        }

        repository.updatePosition(id,input.newPosition());

        return new MoveColumnOutput(id);
    }
}
