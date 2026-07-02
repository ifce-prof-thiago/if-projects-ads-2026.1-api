package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTaskGroupsSQL {

    private final static String SQL = """
            UPDATE task_groups SET is_archived = true
            WHERE board_id IN (SELECT id FROM boards WHERE project_id = ?)
            """;

    private final JdbcClient jdbcClient;

    public ArchiveTaskGroupsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}
