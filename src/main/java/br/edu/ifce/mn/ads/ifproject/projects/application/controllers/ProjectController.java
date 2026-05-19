package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;


import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;

    public ProjectController(ICreateProject createProject, IUpdateProject updateProject) {
        this.createProject = createProject;
        this.updateProject = updateProject;
    }

    @PostMapping
    public ICreateProject.createProjectOutput post(@RequestBody String name){

        UUID currentUserId = UUID.fromString("019dc0e4-df2b-7e14-9354-91df1104846e");
        var input = new ICreateProject.createProjectInput(name, currentUserId);
        return createProject.execute(input);
    }

    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id,
            @RequestBody IUpdateProject.UpdateProjectInput input
    ){
        UUID requesterID = UUID.fromString("019dc0e4-df2b-7e14-9354-91df1104846e");
        return updateProject.execute(id, requesterID, input);
    }
}
