package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.CannotRemoveOwnerException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RemoveMember implements IRemoveMember {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public RemoveMember(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public RemoveMemberOutput execute(UUID projectId, UUID targetUserId) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (targetUserId.equals(project.ownerId())) {
            throw new CannotRemoveOwnerException();
        }

        if (!memberRepository.exists(projectId, targetUserId)) {
            throw new MemberNotFoundException(targetUserId);
        }

        memberRepository.delete(projectId, targetUserId);
        return new RemoveMemberOutput(projectId, targetUserId);
    }
}
