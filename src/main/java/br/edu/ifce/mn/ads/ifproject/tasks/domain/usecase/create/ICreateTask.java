package br.edu.ifce.mn.ads.ifproject.tasks.domain.usecase.create;

import br.edu.ifce.mn.ads.ifproject.tasks.domain.model.Task;

public interface ICreateTask {
    Task execute(Task task);
}