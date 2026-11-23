package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CreateProject implements ICreateProject {

    private final IProjectRepository repository;
    private final IProjectMemberRepository memberRepository;

    public CreateProject(IProjectRepository repository, IProjectMemberRepository memberRepository) {
        this.repository = repository;
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public CreateProjectOutput execute(CreateProjectInput input) {
        final var ownerId = UserLogged.id();
        final var id = repository.persist(ownerId, input);
        memberRepository.persist(id, ownerId, "OWNER");
        return new CreateProjectOutput(id);
    }
}
