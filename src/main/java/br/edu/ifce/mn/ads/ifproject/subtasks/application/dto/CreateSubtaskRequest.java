package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreateSubtaskRequest(
        @NotNull UUID taskId,
        @NotBlank String description,
        @NotNull @Min(0) Integer position
) {
}
