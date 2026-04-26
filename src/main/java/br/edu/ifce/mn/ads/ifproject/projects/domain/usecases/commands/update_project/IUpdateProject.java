package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;


import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateProject {

    UpdateProjectOutput execute(UUID projectId, UUID requesterID, @Valid UpdateProjectInput input);

    record UpdateProjectInput (
            @ProjectName String name
    ){}

    record UpdateProjectOutput(
            UUID projectId
    ){}
}
