package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IListMembers {

    List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable);
}
