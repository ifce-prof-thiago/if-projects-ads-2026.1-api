package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProjectMemberRepository {

    void persist(UUID projectId, UUID userId, String role);

    void delete(UUID projectId, UUID userId);

    boolean exists(UUID projectId, UUID userId);

    record ListMembersOutput(
            UUID userId,
            String username,
            String email,
            String role,
            LocalDateTime joinedAt
    ) {
    }
}
