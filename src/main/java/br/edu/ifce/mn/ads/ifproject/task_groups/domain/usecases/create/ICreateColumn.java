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
            @NotBlank(message = "O nome da coluna é obrigatório")
            @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
            String name,
            @NotNull(message = "A posição da coluna é obrigatória")
            Long position,
            @NotNull(message = "O quadro é obrigatório")
            UUID boardId
    ){

    }
    record CreateColumnOutput(
            UUID id
    ){

    }
}
