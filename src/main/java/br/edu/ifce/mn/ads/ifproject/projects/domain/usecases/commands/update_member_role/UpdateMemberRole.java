package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateMemberRole implements IUpdateMemberRole {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public UpdateMemberRole(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public UpdateMemberRoleOutput execute(UUID projectId, UUID targetUserId, UpdateMemberRoleInput input) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (!memberRepository.exists(projectId, targetUserId)) {
            throw new MemberNotFoundException(targetUserId);
        }

        memberRepository.updateRole(projectId, targetUserId, input.role());
        return new UpdateMemberRoleOutput(projectId, targetUserId);
    }
}
