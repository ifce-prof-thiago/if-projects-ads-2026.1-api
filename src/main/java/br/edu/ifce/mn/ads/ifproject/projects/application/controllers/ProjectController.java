package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;
    private final IListArchivedProjects listArchivedProjects;

    public ProjectController(ICreateProject createProject, IUpdateProject updateProject,
            IListArchivedProjects listArchivedProjects) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.listArchivedProjects = listArchivedProjects;
    }

    @PostMapping
    public ICreateProject.createProjectOutput post(@RequestBody String name) {

        UUID currentUserId = UUID.fromString("019dc0e4-df2b-7e14-9354-91df1104846e");
        var input = new ICreateProject.createProjectInput(name, currentUserId);
        return createProject.execute(input);
    }

    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id,
            @RequestBody IUpdateProject.UpdateProjectInput input) {
        UUID requesterID = UUID.fromString("019dc0e4-df2b-7e14-9354-91df1104846e");
        return updateProject.execute(id, requesterID, input);
    }

    @GetMapping("/archived")
    public IListArchivedProjects.ListArchivedProjectsOutput get(@RequestParam UUID userId) {

        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId);
        return listArchivedProjects.execute(input);
    }
}
