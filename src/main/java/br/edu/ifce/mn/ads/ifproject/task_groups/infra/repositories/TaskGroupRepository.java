package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
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

    @Override
    public Long persist(ICreateColumn.CreateColumnInput input) {
        final var SQL = """
                INSERT INTO task_groups(name, position) VALUES
                (?, ?)
                RETURNING id
                """;
        final var id = db.sql(SQL)
                .param(input.name())
                .param(input.position())
                .query(Long.class)
                .single();
        return id;
    }

}
