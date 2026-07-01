package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteProjectSQL {

    private final static String SQL = """
            DELETE FROM projects WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public DeleteProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID id) {
        jdbcClient.sql(SQL)
                .param(id)
                .update();
    }
}