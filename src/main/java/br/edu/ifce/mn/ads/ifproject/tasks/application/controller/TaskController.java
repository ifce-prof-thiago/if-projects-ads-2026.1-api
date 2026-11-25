package br.edu.ifce.mn.ads.ifproject.tasks.application.controller;

import br.edu.ifce.mn.ads.ifproject.tasks.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.activate.IActivateTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.archived.IArchivedTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.create.ICreateTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.find.IFindTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.move.IMoveTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update.IUpdateTask;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update.TaskResponse;
import br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update.UpdateTaskRequest;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/task")
public class    TaskController {

    private final ICreateTask createTask;
    private final IUpdateTask updateTask;
    private final IActivateTask activateTask;
    private final IArchivedTask archivedTask;
    private final IFindTask findTask;
    private final IMoveTask moveTask;

    public TaskController(ICreateTask createTask, IUpdateTask updateTask, IActivateTask activateTask, IArchivedTask archivedTask,
                          IFindTask findTask, IMoveTask moveTask) {
        this.createTask = createTask;
        this.updateTask = updateTask;
        this.activateTask = activateTask;
        this.archivedTask = archivedTask;
        this.findTask = findTask;
        this.moveTask = moveTask;
    }

    @PatchMapping("/{id}/move")
    public IMoveTask.MoveTaskOutput move(@PathVariable UUID id, @RequestBody IMoveTask.MoveTaskInput input) {
        return moveTask.execute(id, input);
    }

    @GetMapping("/{id}")
    public IFindTask.TaskDetailResponse get(@PathVariable UUID id) {
        return findTask.execute(id);
    }

    public record CreateTaskResponse(UUID id) {
    }

    @PostMapping
    public ResponseEntity<CreateTaskResponse> create(@RequestBody @Valid Task request) {
        final var task = createTask.execute(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CreateTaskResponse(task.getId()));
    }

    @PatchMapping("/{id}/activate")
    public ResponseEntity<Void> activate(@PathVariable UUID id) {
        activateTask.execute(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/archived")
    public ResponseEntity<Void> archived(@PathVariable UUID id) {
        archivedTask.execute(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponse> update(
            @PathVariable UUID id,
            @RequestBody @Valid UpdateTaskRequest request
    ) {
        var response = updateTask.execute(id, request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("O mapeamento do Controller funcionou!");
    }
}