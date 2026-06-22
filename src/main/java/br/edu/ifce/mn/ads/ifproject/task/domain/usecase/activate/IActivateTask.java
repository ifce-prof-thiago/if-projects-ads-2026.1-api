package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.activate;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import java.util.UUID;

public interface IActivateTask {
    Task execute(UUID id);
}