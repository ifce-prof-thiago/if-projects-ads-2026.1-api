package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member;

import java.util.UUID;

public interface IRemoveMember {

    RemoveMemberOutput execute(UUID projectId, UUID targetUserId);

    record RemoveMemberOutput(UUID projectId, UUID userId) {
    }
}
