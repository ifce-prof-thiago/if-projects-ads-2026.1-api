package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TaskGroupRepository implements  ITaskGroupRepository{

    private final JdbcClient db;

    public TaskGroupRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public UUID persist(UUID id) {
        final var SQL = """
                UPDATE task_groups SET is_archived = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public UUID persist(ICreateColumn.CreateColumnInput input) {
        final var SQL = """
            INSERT INTO task_groups(name, position, board_id) VALUES
            (?, ?, ?)
            RETURNING id
            """;
        return db.sql(SQL)
                .param(input.name())
                .param(input.position())
                .param(input.boardId())
                .query(UUID.class)
                .single();
    }

    @Override
    public UUID persist(UUID id, IRenameColumn.RenameColumnInput input) {
        final var SQL = """
                UPDATE task_groups SET name = ? WHERE id = ?
                """;
        db.sql(SQL)
                .param(input.name())
                .param(id)
                .update();
        return id;
    }

    @Override
    public UUID delete(UUID id) {
        final var SQL = """
                DELETE FROM task_groups WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public Long findPositionById(UUID id) {
        final var SQL = """
                SELECT position FROM task_groups WHERE id = ?
                """;

        return db.sql(SQL)
                .param(id)
                .query(Long.class)
                .single();
    }

    @Override
    public void updatePosition(UUID id, Long newPosition) {
        final var SQL = """
                UPDATE task_groups SET position = ? WHERE id = ?
                """;

        db.sql(SQL)
                .param(newPosition)
                .param(id)
                .update();
    }

    @Override
    public void incrementPositions(UUID boardId, Long newPosition, Long oldPosition) {
        final var SQL = """
                UPDATE task_groups
                SET position = position + 1
                WHERE board_id = ?
                AND position >= ?
                AND position < ?
                """;
        db.sql(SQL)
                .param(boardId)
                .param(newPosition)
                .param(oldPosition)
                .update();
    }

    @Override
    public void decrementPositions(UUID boardId, Long newPosition, Long oldPosition) {
        final var SQL = """
                UPDATE task_groups
                SET position = position - 1
                WHERE board_id = ?
                AND position <= ?
                AND position > ?
                """;
        db.sql(SQL)
                .param(boardId)
                .param(newPosition)
                .param(oldPosition)
                .update();
    }



}
