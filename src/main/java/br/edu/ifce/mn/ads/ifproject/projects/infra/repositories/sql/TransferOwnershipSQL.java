package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransferOwnershipSQL {

    private final static String SQL = """
            UPDATE projects SET owner_id = ? WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public TransferOwnershipSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId, UUID newOwnerId) {
        jdbcClient.sql(SQL)
                .param(newOwnerId)
                .param(projectId)
                .update();
    }
}
