package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.MemberRole;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateMemberRole {

    UpdateMemberRoleOutput execute(UUID projectId, UUID targetUserId, @Valid UpdateMemberRoleInput input);

    record UpdateMemberRoleInput(@MemberRole String role) {
    }

    record UpdateMemberRoleOutput(UUID projectId, UUID userId) {
    }
}
