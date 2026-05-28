package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project.IFindProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

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
                             IListArchivedProjects listArchivedProjects,
                             IFindProject findProject) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.listArchivedProjects = listArchivedProjects;
        this.findProject = findProject;
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PostMapping
    public ICreateProject.CreateProjectOutput post(@RequestBody ICreateProject.CreateProjectInput body) {
        return createProject.execute(body);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id,
            @RequestBody IUpdateProject.UpdateProjectInput input) {

        return updateProject.execute(id, input);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @GetMapping("/{id}")
    public IFindProject.FindProjectOutput getById(
            @PathVariable UUID id,
            @RequestHeader("X-User-Id") UUID requesterId) {

        return findProject.execute(id, requesterId);
    }


    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId, Pageable pageable) {
        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, pageable);
        return listArchivedProjects.execute(input, pageable);
    }
}
