package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.CannotTransferToNonMemberException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class TransferOwnership implements ITransferOwnership {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public TransferOwnership(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public TransferOwnershipOutput execute(UUID projectId, TransferOwnershipInput input) {
        final var currentUserId = UserLogged.id();

        final var project = projectRepository.findById(projectId, currentUserId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).isOwner()) {
            throw new InsufficientPermissionException();
        }

        if (currentUserId.equals(input.newOwnerId())) {
            return new TransferOwnershipOutput(projectId, input.newOwnerId());
        }

        if (!memberRepository.exists(projectId, input.newOwnerId())) {
            throw new CannotTransferToNonMemberException(input.newOwnerId());
        }

        projectRepository.transferOwnership(projectId, input.newOwnerId());

        memberRepository.updateRole(projectId, input.newOwnerId(), ProjectRole.ADMIN.name());

        return new TransferOwnershipOutput(projectId, input.newOwnerId());
    }
}
