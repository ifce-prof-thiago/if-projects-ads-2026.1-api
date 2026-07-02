package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreProjectSQL {

    private final static String SQL = """
            UPDATE projects SET archived_at = NULL WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public RestoreProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID id) {
        jdbcClient.sql(SQL)
                .param(id)
                .update();
    }
}
