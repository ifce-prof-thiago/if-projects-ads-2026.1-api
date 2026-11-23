package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.enums.Priority;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.UUID;

public record ConvertToTaskInput(
        @NotNull(message = "Campo não pode ser nulo") UUID subtaskId,
        @NotBlank(message = "Campo título não pode estar vazio") String title,
        @NotBlank(message = "Campo descrição não pode estar vazia") String description,
        @NotNull(message = "Campo priority não pode ser nulo") Priority priority,
        @FutureOrPresent OffsetDateTime dueDate
) {
}
