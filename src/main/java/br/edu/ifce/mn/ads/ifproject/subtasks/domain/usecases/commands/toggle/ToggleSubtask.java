package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle;

import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubtaskRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ToggleSubtask implements IToggleSubtask {
    private final ISubtaskRepository repository;

    public ToggleSubtask(ISubtaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public ToggleSubtaskOutput execute(UUID id) {
        final var result = repository.toggle(id);
        return new ToggleSubtaskOutput(result.id(), result.isCompleted());
    }
}