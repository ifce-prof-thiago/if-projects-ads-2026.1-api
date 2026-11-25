package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update;

import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;
import java.util.UUID;

// Todos os campos são opcionais: null = não altera.
public record UpdateTaskRequest(
        String title,
        String description,
        @Pattern(regexp = "LOW|MEDIUM|HIGH", message = "priority deve ser LOW, MEDIUM ou HIGH")
        String priority,
        UUID assigneeId,
        LocalDateTime dueDate
) {

    // Mantém a forma antiga (só título e descrição) compilando.
    public UpdateTaskRequest(String title, String description) {
        this(title, description, null, null, null);
    }
}
