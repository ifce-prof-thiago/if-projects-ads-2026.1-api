package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;

import java.util.UUID;

public record TaskResponse(UUID id,String title, String description, boolean isAchived) {

    public TaskResponse (Task task) {
        this (task.getId(), task.getTitle(), task.getDescription(), task.getIsArchived());
    }
}
