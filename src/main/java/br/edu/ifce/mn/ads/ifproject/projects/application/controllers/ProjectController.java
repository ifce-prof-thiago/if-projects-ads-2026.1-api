package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.list_archived_projects.IListArchivedProjects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final IListArchivedProjects listArchivedProjects;

    public ProjectController(IListArchivedProjects listArchivedProjects) {
        this.listArchivedProjects = listArchivedProjects;
    }

    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> get(
            @RequestParam UUID userId,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer perPage
    ) {
        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, page, perPage);
        return listArchivedProjects.execute(input);
    }


}
