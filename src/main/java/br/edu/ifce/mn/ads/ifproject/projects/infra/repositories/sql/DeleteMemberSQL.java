package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteMemberSQL {

    private final static String SQL = """
            DELETE FROM project_members WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public DeleteMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void execute(UUID projectId, UUID userId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .update();
    }
}
