package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;
    private final IListArchivedProjects listArchivedProjects;

    public ProjectController(ICreateProject createProject,
                             IUpdateProject updateProject,
                             IListArchivedProjects listArchivedProjects) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.listArchivedProjects = listArchivedProjects;
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PostMapping
    public ICreateProject.createProjectOutput post(@RequestHeader("X-User-Id") UUID currentUserId,
            @RequestBody ICreateProject.CreateProjectRequest body) {

        var input = new ICreateProject.createProjectInput(body.name(), currentUserId);
        return createProject.execute(input);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id, @RequestHeader("X-User-Id") UUID requesterId,
            @RequestBody IUpdateProject.UpdateProjectInput input) {

        return updateProject.execute(id, requesterId, input);
    }

    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId,
                                                                       @RequestParam(defaultValue = "0") Integer page,
                                                                       @RequestParam(defaultValue = "10") Integer perPage) {

        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, page, perPage);
        return listArchivedProjects.execute(input);
    }
}
