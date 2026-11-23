package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.NotBlank;

public record UpdateSubtaskDescriptionRequest(@NotBlank String description) {
}
