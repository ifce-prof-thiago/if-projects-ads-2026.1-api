package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtaskController {

    private final IConversionSubTasks conversionSubTasks;

    public SubtaskController(IConversionSubTasks conversionSubTasks) {
        this.conversionSubTasks = conversionSubTasks;
    }

    @PostMapping("/{subtaskId}/convert-in-task")
    public void conversionSubtask(@PathVariable String subtaskId) {

        conversionSubTasks.execute(
                new IConversionSubTasks.ConversionSubTasksInput(
                        UUID.fromString(subtaskId)
                )
        );
    }

}
