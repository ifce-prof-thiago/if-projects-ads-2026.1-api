package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.UUID;

@Validated
public interface ICreateProject {

    CreateProjectOutput execute(@Valid ICreateProject.CreateProjectInput input);

    record CreateProjectInput(
            @ProjectName String name
    ) {
        public ProjectRole memberRole() {
            return ProjectRole.OWNER;
        }

        public LocalDateTime createdAt() {
            return LocalDateTime.now();
        }
    }

    record CreateProjectOutput(
            UUID id
    ) {
    }
}
