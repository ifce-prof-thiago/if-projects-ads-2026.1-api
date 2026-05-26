package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.find_project.IFindProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindProjectSQL {

    private final JdbcClient jdbcClient;

    public FindProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Optional<IFindProject.FindProjectOutput> execute(UUID id) {
        final var SQL = """
                SELECT id, name, owner_id, created_at, archived_at
                FROM projects
                WHERE id = ?
                """;
        return jdbcClient.sql(SQL)
                .param(id)
                .query((rs, _) -> new IFindProject.FindProjectOutput(
                        rs.getObject("id", UUID.class),
                        rs.getString("name"),
                        rs.getObject("owner_id", UUID.class),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("archived_at") != null
                                ? rs.getTimestamp("archived_at").toLocalDateTime()
                                : null
                ))
                .optional();
    }
}