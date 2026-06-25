package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.create;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;

public interface ICreateTask {
    Task execute(Task task);
}