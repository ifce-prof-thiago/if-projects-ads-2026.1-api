package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;


import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IFindProjectByIdAndUserId {

    IProjectRepository.FindProjectOutput execute(UUID projectId);

}
