package br.edu.ifce.mn.ads.ifproject.task_groups.application.controllers;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive.IArchiveTask;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete.IDeleteColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move.IMoveColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/task_group")
public class TaskGroupController {

    private final IArchiveTask archiveTask;
    private final ICreateColumn createColumn;
    private final IRenameColumn renameColumn;
    private final IDeleteColumn deleteColumn;
    private final IMoveColumn moveColumn;

    public TaskGroupController(IArchiveTask archiveTask, ICreateColumn createColumn, IRenameColumn renameColumn, IDeleteColumn deleteColumn, IMoveColumn moveColumn) {
        this.archiveTask = archiveTask;
        this.createColumn = createColumn;
        this.renameColumn = renameColumn;
        this.deleteColumn = deleteColumn;
        this.moveColumn = moveColumn;
    }

    @PatchMapping("{task_group_id}/archive")
    public IArchiveTask.ArchiveTaskOutput patch(
            @PathVariable("task_group_id") Long id
    ){
        return archiveTask.execute(id);
    }

    @PostMapping
    public ICreateColumn.CreateColumnOutput post(
            @RequestBody ICreateColumn.CreateColumnInput input
    ){
        return createColumn.execute(input);
    }
    @PatchMapping("{task_group_id}/rename")
    public IRenameColumn.RenameColumnOutput patch(
            @PathVariable("task_group_id") Long id,
            @RequestBody IRenameColumn.RenameColumnInput input
    ){
        return renameColumn.execute(id, input);
    }
    @DeleteMapping("{task_group_id}")
    public IDeleteColumn.IDeleteColumnOutput delete(
            @PathVariable("task_group_id") Long id
    ){
        return deleteColumn.execute(id);
    }

    @PatchMapping("{task_group_id}/move")
    public IMoveColumn.MoveColumnOutput move(
            @PathVariable("task_group_id") Long id,
            @RequestBody IMoveColumn.MoveColumnInput input
    ){
        return moveColumn.execute(id, input);
    }
}
