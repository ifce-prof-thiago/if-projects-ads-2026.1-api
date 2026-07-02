package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberAlreadyExistsException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AddMember implements IAddMember {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public AddMember(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public AddMemberOutput execute(UUID projectId, AddMemberInput input) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (memberRepository.exists(projectId, input.userId())) {
            throw new MemberAlreadyExistsException(projectId, input.userId());
        }

        memberRepository.persist(projectId, input.userId(), input.role());
        return new AddMemberOutput(projectId, input.userId());
    }
}
