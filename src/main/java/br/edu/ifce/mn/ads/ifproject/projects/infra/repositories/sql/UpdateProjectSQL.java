package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateProjectSQL {

    private final static String SQL = """
                UPDATE projects SET name = ? WHERE ID = ?
                """;

    private final JdbcClient jdbcClient;

    public UpdateProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public UUID execute(UUID id, IUpdateProject.UpdateProjectInput input) {

        jdbcClient.sql(SQL)
                .param(input.name())
                .param(id)
                .update();

        return id;
    }
}
