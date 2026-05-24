package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
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
                (task_group_id, creator_id, assignee_id, title, description, priority, position, due_date, is_archived, created_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING id
                """;
        return db.sql(SQL).params(input.getTask_group_id(), input.getCreator_id(), input.getAssignee_id(), input.getTitle(), input.getNewDescription(), input.getPriority(), input.getPosition(), input.getDueDate(), input.getIs_archived(), input.getCreated_at()).query(UUID.class).single();

    }

    @Override
    public Optional<SearchIdOutput> findParentTaskInfo(UUID id) {

        final var SQL = """
                SELECT t.task_group_id, t.creator_id, t.assignee_id
                FROM subtasks st JOIN tasks t ON st.task_id = t.id
                WHERE st.id = ?
                """;

        return db.sql(SQL).param(id).query(
                (rs, rowNum) -> {
                return new SearchIdOutput(
                    UUID.fromString(rs.getString("assignee_id")),
                    UUID.fromString(rs.getString("creator_id")),
                    UUID.fromString(rs.getString("task_group_id")));}
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

    public int lastPositionTask(){

        final var SQL = """
                SELECT MAX(position) FROM tasks
                """;

        return db.sql(SQL).query(Integer.class).single();
    }

    @Override
    public boolean isCompletedSubtask(UUID id){

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
