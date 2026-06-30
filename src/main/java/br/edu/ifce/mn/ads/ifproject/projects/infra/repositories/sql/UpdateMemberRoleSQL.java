package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateMemberRoleSQL {

    private final static String SQL = """
            UPDATE project_members SET role = ? WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public UpdateMemberRoleSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID projectId, UUID userId, String role) {
        jdbcClient.sql(SQL)
                .param(role)
                .param(projectId)
                .param(userId)
                .update();
    }
}
