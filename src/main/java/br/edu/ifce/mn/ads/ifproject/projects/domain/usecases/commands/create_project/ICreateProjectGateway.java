package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import java.util.UUID;

public interface ICreateProjectGateway {

    UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input);

}
