package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class FindProjectByIdAndUserId implements IFindProjectByIdAndUserId {

    private final IProjectRepository repository;

    public FindProjectByIdAndUserId(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public IProjectRepository.FindProjectOutput execute(UUID projectId) {

        final var userId = UserLogged.id();
        return repository.findById(projectId, userId).orElseThrow(() -> new ProjectNotFoundException(projectId));

        // TODO: RI8 — verificar se requester é membro quando P2 entregar IProjectMemberRepository
        // memberRepository.findRole(projectId, requesterId)
        //         .orElseThrow(() -> new InsufficientPermissionException());

//        return repository.findById(projectId)
//                .orElseThrow(() -> new ProjectNotFoundException(projectId));

       // throw new UnsupportedOperationException("RI8 — implementar FindProjectByIdAndUserId quando P2 entregar IProjectMemberRepository");
    }
}
