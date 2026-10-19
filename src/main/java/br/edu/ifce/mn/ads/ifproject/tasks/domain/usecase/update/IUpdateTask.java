package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.update;

import java.util.UUID;

public interface IUpdateTask {
    TaskResponse execute(UUID id, UpdateTaskRequest request);
}
