package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;

import java.util.UUID;

public interface IProjectRepository {
    UUID persist(ICreateProject.createProjectInput input);
    UUID update(UUID id, IUpdateProject.UpdateProjectInput input);
}
