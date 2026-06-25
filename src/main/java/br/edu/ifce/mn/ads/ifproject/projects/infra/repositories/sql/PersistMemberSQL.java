package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersistMemberSQL {

    private final static String SQL = """
            INSERT INTO project_members(project_id, user_id, role) VALUES (?, ?, ?)
            """;

    private final JdbcClient jdbcClient;

    public PersistMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID projectId, UUID userId, String role) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .param(role)
                .update();
    }
}
