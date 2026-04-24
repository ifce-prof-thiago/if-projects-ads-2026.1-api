package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateProject {

    ICreateProject.createProjectOutput execute(@Valid ICreateProject.createProjectInput input);


    record createProjectInput(
            @ProjectName String name,
            UUID ownerId
    ){}

    record createProjectOutput(
            java.util.UUID id
    ){}
}
