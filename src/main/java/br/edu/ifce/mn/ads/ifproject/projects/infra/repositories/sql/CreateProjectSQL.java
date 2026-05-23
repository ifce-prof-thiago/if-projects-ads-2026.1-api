package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateProjectSQL {

    private final static String SQL = """
                INSERT INTO projects(name, owner_id) VALUES (?, ?)
                RETURNING id
                """;

    private final JdbcClient jdbcClient;

    public CreateProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public UUID execute(ICreateProject.createProjectInput input){


        return jdbcClient.sql(SQL)
                .param(input.name())
                .param(input.ownerId())
                .query(UUID.class)
                .single();
    }
}
