package br.edu.ifce.mn.ads.ifproject.task.infra.repositories;


import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import org.springframework.data.repository.ListCrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ITaskRepository extends ListCrudRepository<Task, UUID> {

    Task save(Task task);

    Optional<Task> findById(UUID id);

    List<Task> findByTaskGroupId(UUID TaskGrupId);

    void deleteById(UUID id);

}
