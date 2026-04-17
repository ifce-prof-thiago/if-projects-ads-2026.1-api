package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;

public interface ITaskGroupRepository {
    Long persist(Long id);
    Long persist(ICreateColumn.CreateColumnInput input);
    Long persist(Long id, IRenameColumn.RenameColumnInput input );
    Long delete(Long id);
}
