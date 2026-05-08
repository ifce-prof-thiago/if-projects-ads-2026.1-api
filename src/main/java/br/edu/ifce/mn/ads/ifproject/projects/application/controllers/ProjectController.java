package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final IListArchivedProjects listArchivedProjects;

    public ProjectController(IListArchivedProjects listArchivedProjects) {
        this.listArchivedProjects = listArchivedProjects;
    }

    @GetMapping("/archived")
    public IListArchivedProjects.ListArchivedProjectsOutput get(@RequestParam UUID userId) {

        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId);
        return listArchivedProjects.execute(input);
    }


}
