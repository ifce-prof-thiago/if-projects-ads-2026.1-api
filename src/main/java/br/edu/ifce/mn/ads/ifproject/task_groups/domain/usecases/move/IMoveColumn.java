package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IMoveColumn {

    MoveColumnOutput execute(UUID id, @Valid MoveColumnInput input);

    record MoveColumnInput(
            @NotNull(message = "A nova posição é obrigatória")
            Long newPosition,
            @NotNull(message = "O quadro é obrigatório")
            UUID boardId
    ){}

    record MoveColumnOutput(
            UUID id
    ){}
}
