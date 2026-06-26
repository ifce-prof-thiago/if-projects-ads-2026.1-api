package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveBoardsSQL {

    private final static String SQL = """
            UPDATE boards SET is_archived = true WHERE project_id = ?
            """;

    private final JdbcClient jdbcClient;

    public ArchiveBoardsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}
