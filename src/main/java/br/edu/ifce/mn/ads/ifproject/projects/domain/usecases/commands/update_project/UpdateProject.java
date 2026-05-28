package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class UpdateProject implements IUpdateProject {

    private final IProjectRepository repository;

    public UpdateProject(IProjectRepository repository) {
        this.repository = repository;
    }


    @Override
    public UpdateProjectOutput execute(UUID projectId, UpdateProjectInput input) {
        repository.findById(projectId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));
        // TODO: verificar permissão quando P2 entregar IProjectMemberRepository
        // final var role = memberRepository.findRole(projectId, requesterId)
        //         .orElseThrow(() -> new InsufficientPermissionException());
        // if (!role.canEdit()) throw new InsufficientPermissionException();
        repository.update(projectId, input);
        return new UpdateProjectOutput(projectId);
    }
}
