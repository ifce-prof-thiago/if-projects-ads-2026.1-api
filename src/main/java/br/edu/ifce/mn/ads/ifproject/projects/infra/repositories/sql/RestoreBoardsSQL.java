package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreBoardsSQL {

    private final static String SQL = """
            UPDATE boards SET is_archived = false WHERE project_id = ?
            """;

    private final JdbcClient jdbcClient;

    public RestoreBoardsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}
