package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FindOwnerIdSQL {

    private final static String SQL = """
            SELECT owner_id FROM projects WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public FindOwnerIdSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public UUID execute(UUID projectId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .query(UUID.class)
                .single();
    }
}
