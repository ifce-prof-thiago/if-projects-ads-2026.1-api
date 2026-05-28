package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
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

    public Optional<IProjectRepository.FindProjectOutput> execute(UUID id, UUID userId) {
        final var SQL = """
                SELECT id, name, owner_id, role, created_at, archived_at
                FROM projects p 
                    LEFT JOIN project_members pm ON p.id = pm.project_id AND user_id = ?
                WHERE id = ? 
                    AND (p.owner_id = ? OR pm.user_id IS NOT NULL)
                """;
        return jdbcClient.sql(SQL)
                .param(userId)
                .param(id)
                .param(userId)
                .query((rs, _) -> {
                    var role = rs.getString("role");
                    final var ownerId = rs.getObject("owner_id", UUID.class);
                    if(ownerId.equals(userId)) {
                        role = ProjectRole.OWNER.name();
                    }
                    return new IProjectRepository.FindProjectOutput(
                            rs.getObject("id", UUID.class),
                            rs.getString("name"),
                            rs.getObject("owner_id", UUID.class),
                            role,
                            rs.getTimestamp("created_at").toLocalDateTime(),
                            rs.getTimestamp("archived_at") != null
                                    ? rs.getTimestamp("archived_at").toLocalDateTime()
                                    : null
                    );
                })
                .optional();
    }
}