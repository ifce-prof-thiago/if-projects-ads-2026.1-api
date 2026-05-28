package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class FindProject implements IFindProject {

    private final IProjectRepository repository;

    public FindProject(IProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public IFindProject.FindProjectOutput execute(UUID projectId, UUID requesterId) {
        // TODO: RI8 — verificar se requester é membro quando P2 entregar IProjectMemberRepository
        // memberRepository.findRole(projectId, requesterId)
        //         .orElseThrow(() -> new InsufficientPermissionException());

        return repository.findById(projectId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));
    }
}
