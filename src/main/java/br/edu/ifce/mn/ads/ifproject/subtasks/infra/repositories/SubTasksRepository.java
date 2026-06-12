package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.SearchIdOutput;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SubTasksRepository implements ISubTasksRepository {

    private final JdbcClient db;

    public SubTasksRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public UUID persistNewTask(ConvertToTaskInput input) {

        final var SQL = """
                INSERT INTO tasks
                (task_group_id, creator_id, assignee_id, title, position, is_archived, created_at) VALUES (?, ?, ?, ?, ?, ?, ?) RETURNING id
                """;
        return db.sql(SQL).params(input.task_group_id(), input.creator_id(), input.assignee_id(), input.title(), input.position(), input.is_archived(), input.created_at()).query(UUID.class).single();

    }

    @Override
    public Optional<SearchIdOutput> findParentTaskInfo(UUID id) {

        final var SQL = """
                SELECT t.task_group_id, t.creator_id, t.assignee_id, st.description
                FROM subtasks st JOIN tasks t ON st.task_id = t.id
                WHERE st.id = ?
                """;

        return db.sql(SQL).param(id).query(
                (rs, rowNum) -> new SearchIdOutput(
                        rs.getObject("assignee_id", UUID.class),
                        UUID.fromString(rs.getString("creator_id")),
                        UUID.fromString(rs.getString("task_group_id")),
                        rs.getString("description")
                )
        ).optional();
    }

    @Override
    public void removeSubtask(UUID id) {
        final var SQL = """
                DELETE FROM subtasks
                WHERE id = ?
                """;

        db.sql(SQL).param(id).update();
    }

    public int lastPositionTask() {

        // TODO buscar a maior posição dentro de um grupo de tarefas
        final var SQL = """
                SELECT MAX(position) FROM tasks
                """;

        return db.sql(SQL).query(Integer.class).single();
    }

    @Override
    public boolean isCompletedSubtask(UUID id) {

        final var SQL = """
                SELECT is_completed FROM subtasks WHERE id = ?
                """;
        return db.sql(SQL).param(id).query(Boolean.class).single();

    }

    @Override
    public void updatePositionSubtasksAfterConversion(int position) {

        final var SQL = """
                UPDATE subtasks SET position = position - 1 WHERE position > ?
                """;

        db.sql(SQL).param(position).update();
    }

    @Override
    public int getPositionConvertedSubtask(UUID id) {

        final var SQL = """
                SELECT position FROM subtasks WHERE id = ?
                """;

        return db.sql(SQL).param(id).query(Integer.class).single();
    }

}
