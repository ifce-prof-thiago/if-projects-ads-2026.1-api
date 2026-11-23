package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.NotNull;

public record UpdateSubtaskCompletionRequest(@NotNull Boolean completed) {
}
