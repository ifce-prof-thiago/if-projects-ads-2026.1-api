package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;


import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;

import java.util.UUID;

public interface IFindProjectByIdAndUserId {

    IProjectRepository.FindProjectOutput execute(UUID projectId);

}
