package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.archived;

import br.edu.ifce.mn.ads.ifproject.tasks.domain.model.Task;

import java.util.UUID;

public interface IArchivedTask {

    Task execute(UUID id);
}
