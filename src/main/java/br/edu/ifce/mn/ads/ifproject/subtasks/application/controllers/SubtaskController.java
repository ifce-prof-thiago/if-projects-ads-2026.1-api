package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtaskController {
    private final IToggleSubtask toggleSubtask;
    private final IConversionSubTasks conversionSubTasks;

    public SubtaskController(IToggleSubtask toggleSubtask, IConversionSubTasks conversionSubTasks) {
        this.toggleSubtask = toggleSubtask;
        this.conversionSubTasks = conversionSubTasks;
    }

    @PatchMapping("{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }

    @PostMapping("/conversion")
    public void conversionSubtask(@RequestBody @Valid ConvertToTaskInput input) {
        conversionSubTasks.execute(input);
    }

}
