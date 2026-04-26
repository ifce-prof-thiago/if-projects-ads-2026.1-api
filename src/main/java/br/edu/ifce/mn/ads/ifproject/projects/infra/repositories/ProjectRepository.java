package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final JdbcClient db;

    public ProjectRepository(JdbcClient db) {
        this.db = db;
    }

    public UUID persist(ICreateProject.createProjectInput input){
        final var SQL = """
                INSERT INTO projects(name, owner_id) VALUES (?, ?)
                RETURNING id
                """;

        return db.sql(SQL)
                .param(input.name())
                .param(input.ownerId())
                .query(UUID.class)
                .single();
    }

    @Override
    public UUID update(UUID id, IUpdateProject.UpdateProjectInput input) {
        final var SQL = """
                UPDATE projects SET name = ? WHERE ID = ?
                """;
        db.sql(SQL)
                .param(input.name())
                .param(id)
                .update();

        return id;
    }
}
