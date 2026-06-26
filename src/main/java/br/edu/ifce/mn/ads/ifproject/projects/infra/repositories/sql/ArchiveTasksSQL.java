package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTasksSQL {

    private final static String SQL = """
            UPDATE tasks SET is_archived = true
            WHERE task_group_id IN (
                SELECT tg.id FROM task_groups tg
                    JOIN boards b ON tg.board_id = b.id
                WHERE b.project_id = ?
            )
            """;

    private final JdbcClient jdbcClient;

    public ArchiveTasksSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}
