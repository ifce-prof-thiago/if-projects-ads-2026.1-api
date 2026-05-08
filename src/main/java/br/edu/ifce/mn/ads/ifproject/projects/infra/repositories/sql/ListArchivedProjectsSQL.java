package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;


import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListArchivedProjectsSQL {

    private final static String SQL = """
            SELECT p.id, p.name, p.archived_at as archivedAt
            FROM projects p
            WHERE p.owner_id = ?
            AND p.archived_at IS NOT NULL
            ORDER BY p.archived_at DESC, p.id DESC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListArchivedProjectsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<IListArchivedProjects.IListArchivedProjectsOutput> execute(
            IListArchivedProjects.ListArchivedProjectsInput input
    ) {
        int safePage = Math.max(input.page(), 0);
        int safeSize = Math.max(input.perPage(), 1);
        int offset = safePage * safeSize;

        return jdbcClient.sql(SQL)
                .param(input.userId())
                .param(safeSize)
                .param(offset)
                .query(IListArchivedProjects.IListArchivedProjectsOutput.class)
                .list();
    }

}
