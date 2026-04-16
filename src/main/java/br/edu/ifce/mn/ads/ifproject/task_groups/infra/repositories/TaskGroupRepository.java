package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

@Component
public class TaskGroupRepository implements  ITaskGroupRepository{

    private final JdbcClient db;

    public TaskGroupRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public Long persist(Long id) {
        final var SQL = """
                UPDATE task_groups SET is_archived = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }
}
