package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.list;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ListColumnsByBoard implements IListColumnsByBoard {

    private final ITaskGroupRepository repository;

    public ListColumnsByBoard(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColumnOutput> execute(UUID boardId) {
        if (!repository.boardExists(boardId)) {
            throw new NotFoundException("Board not found: " + boardId);
        }

        // Duas consultas (colunas + tarefas do quadro) em vez de uma por coluna.
        final var tasksByColumn = repository.findActiveTasksByBoard(boardId).stream()
                .collect(Collectors.groupingBy(TaskItem::taskGroupId));

        return repository.findActiveColumnsByBoard(boardId).stream()
                .map(column -> new ColumnOutput(
                        column.id(),
                        column.name(),
                        column.position(),
                        column.boardId(),
                        tasksByColumn.getOrDefault(column.id(), List.of())
                ))
                .toList();
    }
}
