package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;

import java.util.UUID;

public interface ITaskGroupRepository {
    UUID persist(UUID id);
    UUID persist(ICreateColumn.CreateColumnInput input);
    UUID persist(UUID id, IRenameColumn.RenameColumnInput input );
    UUID delete(UUID id);
    Long findPositionById(UUID id);

    void updatePosition(UUID id, Long newPosition);
    void incrementPositions(UUID boardId, Long newPosition, Long oldPosition);
    void decrementPositions(UUID boardId, Long newPosition, Long oldPosition);


}
