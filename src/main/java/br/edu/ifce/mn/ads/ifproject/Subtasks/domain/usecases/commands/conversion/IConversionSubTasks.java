package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.conversion;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface IConversionSubTasks {

    public void execute(ConversionSubtaskInput input);

    record ConversionSubtaskInput(
            @NotNull(message= "Campo não pode ser nulo!") UUID subtaskId
    ){}
}
