package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.CreateSubtaskRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.SubtaskResponse;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.UpdateSubtaskCompletionRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.UpdateSubtaskDescriptionRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.SubtaskCrudRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/subtasks")
public class SubtaskController {
    private final IToggleSubtask toggleSubtask;
    private final IConversionSubTasks conversionSubTasks;
    private final SubtaskCrudRepository crudRepository;

    public SubtaskController(
            IToggleSubtask toggleSubtask,
            IConversionSubTasks conversionSubTasks,
            SubtaskCrudRepository crudRepository
    ) {
        this.toggleSubtask = toggleSubtask;
        this.conversionSubTasks = conversionSubTasks;
        this.crudRepository = crudRepository;
    }

    @PostMapping
    public ResponseEntity<UUID> create(@RequestBody @Valid CreateSubtaskRequest input) {
        return ResponseEntity.status(HttpStatus.CREATED).body(crudRepository.create(input));
    }

    @GetMapping("/task-groups/{taskId}")
    public List<SubtaskResponse> listByTask(@PathVariable UUID taskId) {
        return crudRepository.findByTaskId(taskId);
    }

    @PatchMapping("/{subtaskId}/description")
    public ResponseEntity<Void> updateDescription(
            @PathVariable UUID subtaskId,
            @RequestBody @Valid UpdateSubtaskDescriptionRequest input
    ) {
        crudRepository.updateDescription(subtaskId, input.description());
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{subtaskId}/completion")
    public ResponseEntity<Void> updateCompletion(
            @PathVariable UUID subtaskId,
            @RequestBody @Valid UpdateSubtaskCompletionRequest input
    ) {
        crudRepository.updateCompletion(subtaskId, input.completed());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{subtaskId}")
    public ResponseEntity<Void> delete(@PathVariable UUID subtaskId) {
        crudRepository.delete(subtaskId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }

    @PostMapping("/conversion")
    public ResponseEntity<Void> conversionSubtask(@RequestBody @Valid ConvertToTaskInput input) {
        conversionSubTasks.execute(input);
        return ResponseEntity.noContent().build();
    }

}
