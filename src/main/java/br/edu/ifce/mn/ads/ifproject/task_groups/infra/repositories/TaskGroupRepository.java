package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.list.IListColumnsByBoard;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
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

    @Override
    public boolean boardExists(UUID boardId) {
        final var SQL = """
                SELECT EXISTS(SELECT 1 FROM boards WHERE id = ?)
                """;
        return db.sql(SQL)
                .param(boardId)
                .query(Boolean.class)
                .single();
    }

    @Override
    public List<IListColumnsByBoard.ColumnRow> findActiveColumnsByBoard(UUID boardId) {
        final var SQL = """
                SELECT id, name, position, board_id
                FROM task_groups
                WHERE board_id = ? AND is_archived = false
                ORDER BY position ASC, created_at ASC
                """;
        return db.sql(SQL)
                .param(boardId)
                .query((rs, rowNum) -> new IListColumnsByBoard.ColumnRow(
                        rs.getObject("id", UUID.class),
                        rs.getString("name"),
                        rs.getLong("position"),
                        rs.getObject("board_id", UUID.class)
                ))
                .list();
    }

    @Override
    public List<IListColumnsByBoard.TaskItem> findActiveTasksByBoard(UUID boardId) {
        final var SQL = """
                SELECT t.id, t.task_group_id, t.creator_id, t.assignee_id, t.title, t.description,
                       t.priority, t.position, t.due_date, t.is_archived
                FROM tasks t
                    JOIN task_groups tg ON t.task_group_id = tg.id
                WHERE tg.board_id = ? AND t.is_archived = false
                ORDER BY t.position ASC, t.created_at ASC
                """;
        return db.sql(SQL)
                .param(boardId)
                .query((rs, rowNum) -> {
                    final Timestamp dueDate = rs.getTimestamp("due_date");
                    return new IListColumnsByBoard.TaskItem(
                            rs.getObject("id", UUID.class),
                            rs.getObject("task_group_id", UUID.class),
                            rs.getObject("creator_id", UUID.class),
                            rs.getObject("assignee_id", UUID.class),
                            rs.getString("title"),
                            rs.getString("description"),
                            rs.getString("priority"),
                            rs.getInt("position"),
                            dueDate != null ? dueDate.toLocalDateTime() : null,
                            rs.getBoolean("is_archived")
                    );
                })
                .list();
    }
}
