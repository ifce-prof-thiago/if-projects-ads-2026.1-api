package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IAddMember {

    AddMemberOutput execute(UUID projectId, @Valid AddMemberInput input);

    record AddMemberInput(UUID userId, String role) {
    }

    record AddMemberOutput(UUID projectId, UUID userId) {
    }
}
