package br.edu.ifce.mn.ads.ifproject.tasks.infra.repositories;


import br.edu.ifce.mn.ads.ifproject.tasks.domain.model.Task;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ITaskRepository extends ListCrudRepository<Task, UUID> {

    Task save(Task task);

    Optional<Task> findById(UUID id);

    List<Task> findByTaskGroupId(UUID TaskGrupId);

    void deleteById(UUID id);

    @Query("SELECT EXISTS(SELECT 1 FROM task_groups WHERE id = :id)")
    boolean taskGroupExists(@Param("id") UUID id);

    // Abre espaço: posições em [fromPosition, toPosition) andam +1
    @Modifying
    @Query("""
            UPDATE tasks SET position = position + 1
            WHERE task_group_id = :taskGroupId AND position >= :fromPosition AND position < :toPosition
            """)
    void incrementPositions(@Param("taskGroupId") UUID taskGroupId,
                            @Param("fromPosition") int fromPosition,
                            @Param("toPosition") int toPosition);

    // Fecha o buraco: posições em (fromPosition, toPosition] andam -1
    @Modifying
    @Query("""
            UPDATE tasks SET position = position - 1
            WHERE task_group_id = :taskGroupId AND position > :fromPosition AND position <= :toPosition
            """)
    void decrementPositions(@Param("taskGroupId") UUID taskGroupId,
                            @Param("fromPosition") int fromPosition,
                            @Param("toPosition") int toPosition);

}
