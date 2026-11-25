package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.MemberRole;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.UUID;

@Validated
public interface IAddMember {

    AddMemberOutput execute(UUID projectId, @Valid AddMemberInput input);

    record AddMemberInput(@NotNull UUID userId, @MemberRole String role) {
        public LocalDateTime joinedAt() {
            return LocalDateTime.now();
        }
    }

    record AddMemberOutput(UUID projectId, UUID userId) {
    }
}
