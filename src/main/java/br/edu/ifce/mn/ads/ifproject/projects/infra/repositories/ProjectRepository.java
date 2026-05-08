package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepository implements IProjectRepository {

    private final JdbcClient jdbcClient;

    public ProjectRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public IListArchivedProjects.ListArchivedProjectsOutput findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input
    ) {
        final var SQL = """
                SELECT p.id, p.name, p.archived_at as archivedAt
                FROM projects p
                JOIN project_members pm ON p.id = pm.project_id
                WHERE pm.user_id = ?
                AND p.archived_at IS NOT NULL
                """;

        var list = jdbcClient.sql(SQL)
                .param(input.userId())
                .query(IListArchivedProjects.ProjectList.class)
                .list();

        return new IListArchivedProjects.ListArchivedProjectsOutput(list);
    }
}
