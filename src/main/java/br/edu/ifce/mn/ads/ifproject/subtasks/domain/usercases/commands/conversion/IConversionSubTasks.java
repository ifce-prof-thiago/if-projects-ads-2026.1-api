package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface IConversionSubTasks {

    void execute(ConversionSubTasksInput input);

    record ConversionSubTasksInput(
            @NotNull(message = "Campo não pode ser nulo") UUID subtaskId
    ) {
    }
}
