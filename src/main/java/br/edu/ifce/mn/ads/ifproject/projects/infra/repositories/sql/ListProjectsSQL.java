package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListProjectsSQL {

    private final static String SQL = """
            SELECT p.id, p.name, p.owner_id, p.created_at
            FROM projects p
                JOIN project_members pm ON p.id = pm.project_id
            WHERE pm.user_id = ? AND p.archived_at IS NULL
            ORDER BY p.created_at DESC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListProjectsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<IProjectRepository.ListProjectsOutput> execute(UUID userId, Pageable pageable) {
        return jdbcClient.sql(SQL)
                .param(userId)
                .param(pageable.getPageSize())
                .param(pageable.getOffset())
                .query(IProjectRepository.ListProjectsOutput.class)
                .list();
    }
}