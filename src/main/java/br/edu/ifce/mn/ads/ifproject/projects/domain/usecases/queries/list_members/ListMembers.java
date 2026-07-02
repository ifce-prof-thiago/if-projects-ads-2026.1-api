package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListMembers implements IListMembers {

    private final IProjectMemberRepository memberRepository;

    public ListMembers(IProjectMemberRepository memberRepository) {
        this.memberRepository = memberRepository;

    }

    @Override
    public List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable) {
        return memberRepository.findAllByProjectId(projectId, pageable);
    }
}
