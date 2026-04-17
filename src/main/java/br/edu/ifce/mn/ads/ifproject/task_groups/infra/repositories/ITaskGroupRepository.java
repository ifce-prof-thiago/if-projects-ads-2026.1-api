package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;

public interface ITaskGroupRepository {
    Long persist(Long id);
    Long persist(ICreateColumn.CreateColumnInput input);
}
