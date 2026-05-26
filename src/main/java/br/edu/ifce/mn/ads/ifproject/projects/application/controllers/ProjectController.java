package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.find_project.IFindProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;
    private final IListArchivedProjects listArchivedProjects;
    private final IFindProject findProject;

    public ProjectController(ICreateProject createProject,
                             IUpdateProject updateProject,
                             IListArchivedProjects listArchivedProjects, IFindProject findProject) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.listArchivedProjects = listArchivedProjects;
        this.findProject = findProject;
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PostMapping
    public ICreateProject.createProjectOutput post(@RequestHeader("X-User-Id") UUID currentUserId,
            @RequestBody ICreateProject.CreateProjectRequest body) {

        var input = new ICreateProject.createProjectInput(currentUserId, body.name());
        return createProject.execute(input);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id, @RequestHeader("X-User-Id") UUID requesterId,
            @RequestBody IUpdateProject.UpdateProjectInput input) {

        return updateProject.execute(id, requesterId, input);
    }

    @GetMapping("/{id}")
    public IFindProject.FindProjectOutput getById(
            @PathVariable UUID id,
            @RequestHeader("X-User-Id") UUID requesterId) {

        return findProject.execute(id, requesterId);
    }


    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId,Pageable pageable) {

        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, pageable);
        return listArchivedProjects.execute(input, pageable);
    }
}
