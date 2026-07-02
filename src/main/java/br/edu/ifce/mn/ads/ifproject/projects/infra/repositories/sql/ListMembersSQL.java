package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListMembersSQL {

    private final static String SQL = """
            SELECT pm.user_id, u.username, u.email, pm.role, pm.joined_at
            FROM project_members pm
                JOIN users u ON pm.user_id = u.id
            WHERE pm.project_id = ?
            ORDER BY pm.joined_at ASC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListMembersSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(pageable.getPageSize())
                .param(pageable.getOffset())
                .query(IProjectMemberRepository.ListMembersOutput.class)
                .list();
    }
}
