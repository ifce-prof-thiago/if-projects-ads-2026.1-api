package br.edu.ifce.mn.ads.ifproject.projects.infra.gateways;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProjectGateway;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class CreateProjectGateway implements ICreateProjectGateway {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository projectMemberRepository;

    public CreateProjectGateway(
            final IProjectRepository projectRepository,
            final IProjectMemberRepository projectMemberRepository) {
        this.projectRepository = projectRepository;
        this.projectMemberRepository = projectMemberRepository;
    }

    @Override
    @Transactional
    public UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input) {
        final var projectId = projectRepository.persist(ownerId, input);
        projectMemberRepository.persist(projectId, ownerId, input.memberRole().toString(), input.createdAt());
        return projectId;
    }

}
