package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ExistsMemberSQL {

    private final static String SQL = """
            SELECT EXISTS(SELECT 1 FROM project_members WHERE project_id = ? AND user_id = ?)
            """;

    private final JdbcClient jdbcClient;

    public ExistsMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public boolean execute(UUID projectId, UUID userId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .query(Boolean.class)
                .single();
    }
}
