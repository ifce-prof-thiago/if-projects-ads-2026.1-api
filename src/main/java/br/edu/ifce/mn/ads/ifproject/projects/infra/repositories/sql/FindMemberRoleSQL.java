package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindMemberRoleSQL {

    private final static String SQL = """
            SELECT role FROM project_members WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public FindMemberRoleSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Optional<String> execute(UUID projectId, UUID userId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .query(String.class)
                .optional();
    }
}
