package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/subtask")
public class SubtaskController {

    private final IConversionSubTasks conversionSubTasks;

    public SubtaskController(IConversionSubTasks conversionSubTasks) {
        this.conversionSubTasks = conversionSubTasks;
    }

    @PostMapping("/conversion")
    public void conversionSubtask(@RequestBody @Valid ConvertToTaskInput input) {
        conversionSubTasks.execute(input);
    }

}
