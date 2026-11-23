package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.CreateSubtaskRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.SubtaskResponse;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class SubtaskCrudRepository {

    private final JdbcClient db;

    public SubtaskCrudRepository(JdbcClient db) {
        this.db = db;
    }

    public UUID create(CreateSubtaskRequest input) {
        return db.sql("""
                        INSERT INTO subtasks(task_id, description, position)
                        VALUES (?, ?, ?)
                        RETURNING id
                        """)
                .params(input.taskId(), input.description(), input.position())
                .query(UUID.class)
                .single();
    }

    public List<SubtaskResponse> findByTaskId(UUID taskId) {
        return db.sql("""
                        SELECT id, task_id, description, position, is_completed, created_at
                        FROM subtasks
                        WHERE task_id = ?
                        ORDER BY position, created_at
                        """)
                .param(taskId)
                .query((rs, rowNum) -> new SubtaskResponse(
                        rs.getObject("id", UUID.class),
                        rs.getObject("task_id", UUID.class),
                        rs.getString("description"),
                        rs.getInt("position"),
                        rs.getBoolean("is_completed"),
                        rs.getObject("created_at", OffsetDateTime.class)
                ))
                .list();
    }

    public void updateDescription(UUID id, String description) {
        update("UPDATE subtasks SET description = ? WHERE id = ?", description, id);
    }

    public void updateCompletion(UUID id, boolean completed) {
        update("UPDATE subtasks SET is_completed = ? WHERE id = ?", completed, id);
    }

    public void delete(UUID id) {
        update("DELETE FROM subtasks WHERE id = ?", id);
    }

    private void update(String sql, Object... params) {
        if (db.sql(sql).params(params).update() == 0) {
            throw new ResourceNotFoundException("Subtarefa não encontrada");
        }
    }
}
