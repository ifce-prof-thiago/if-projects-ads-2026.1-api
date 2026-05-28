package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateProject {

    CreateProjectOutput execute(@Valid ICreateProject.CreateProjectInput input);

    record CreateProjectInput(
            @ProjectName String name
    ) {
    }

    record CreateProjectOutput(
            UUID id
    ) {
    }
}
