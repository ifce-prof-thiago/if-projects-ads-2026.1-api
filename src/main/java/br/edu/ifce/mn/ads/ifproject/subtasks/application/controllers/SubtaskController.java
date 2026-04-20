package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtaskController {
    private final IToggleSubtask toggleSubtask;

    public SubtaskController(IToggleSubtask toggleSubtask) {
        this.toggleSubtask = toggleSubtask;
    }

    @PatchMapping("{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }
}