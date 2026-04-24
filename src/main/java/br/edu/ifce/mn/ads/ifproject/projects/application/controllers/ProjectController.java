package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;


import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;

    public ProjectController(ICreateProject createProject) {
        this.createProject = createProject;
    }

    @PostMapping
    public ICreateProject.createProjectOutput post(@RequestBody String name){

        UUID currentUserId = UUID.fromString("019dc0e4-df2b-7e14-9354-91df1104846e");
        var input = new ICreateProject.createProjectInput(name, currentUserId);
        return createProject.execute(input);
    }
}
