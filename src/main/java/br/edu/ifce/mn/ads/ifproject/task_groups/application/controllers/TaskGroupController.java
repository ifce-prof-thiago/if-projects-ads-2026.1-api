package br.edu.ifce.mn.ads.ifproject.task_groups.application.controllers;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive.IArchiveTask;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/task_group")
public class TaskGroupController {

    private final IArchiveTask archiveTask;

    public TaskGroupController(IArchiveTask archiveTask) {
        this.archiveTask = archiveTask;
    }

    @PatchMapping("{task_group_id}/archive")
    public IArchiveTask.ArchiveTaskOutput patch(
            @PathVariable("task_group_id") Long id
    ){
        return archiveTask.execute(id);
    }
}
