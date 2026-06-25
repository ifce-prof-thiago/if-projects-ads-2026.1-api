package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import java.util.UUID;

public interface ISubtaskRepository {
    SubtaskToggleResult toggle(UUID id);

    record SubtaskToggleResult(UUID id, boolean isCompleted) {}
}