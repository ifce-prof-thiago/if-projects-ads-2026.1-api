package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateMemberRole {

    UpdateMemberRoleOutput execute(UUID projectId, UUID targetUserId, @Valid UpdateMemberRoleInput input);

    record UpdateMemberRoleInput(String role) {
    }

    record UpdateMemberRoleOutput(UUID projectId, UUID userId) {
    }
}
