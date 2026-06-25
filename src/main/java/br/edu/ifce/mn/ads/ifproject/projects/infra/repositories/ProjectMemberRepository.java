package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectMemberRepository implements IProjectMemberRepository {

    private final PersistMemberSQL persistMemberSQL;
    private final DeleteMemberSQL deleteMemberSQL;
    private final ExistsMemberSQL existsMemberSQL;

    public ProjectMemberRepository(
            PersistMemberSQL persistMemberSQL,
            DeleteMemberSQL deleteMemberSQL,
            ExistsMemberSQL existsMemberSQL
    ) {
        this.persistMemberSQL = persistMemberSQL;
        this.deleteMemberSQL = deleteMemberSQL;
        this.existsMemberSQL = existsMemberSQL;
    }

    @Override
    public void persist(UUID projectId, UUID userId, String role) {
        persistMemberSQL.execute(projectId, userId, role);
    }

    @Override
    public void delete(UUID projectId, UUID userId) {
        deleteMemberSQL.execute(projectId, userId);
    }

    @Override
    public boolean exists(UUID projectId, UUID userId) {
        return existsMemberSQL.execute(projectId, userId);
    }
}
