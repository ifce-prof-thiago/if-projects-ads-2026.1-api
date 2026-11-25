package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateColumn {
    CreateColumnOutput execute(@Valid CreateColumnInput input);

    record CreateColumnInput(
            @NotBlank @Size(min = 3, max = 30)
            String name,
            @NotNull
            Long position,
            @NotNull
            UUID boardId
    ){

    }
    record CreateColumnOutput(
            UUID id
    ){

    }
}
