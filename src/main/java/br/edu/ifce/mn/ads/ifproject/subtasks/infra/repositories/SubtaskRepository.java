package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.sql.ToggleSubtaskSQL;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class SubtaskRepository implements ISubtaskRepository {
    private final ToggleSubtaskSQL toggleSubtaskSQL;

    public SubtaskRepository(ToggleSubtaskSQL toggleSubtaskSQL) {
        this.toggleSubtaskSQL = toggleSubtaskSQL;
    }

    @Override
    public IToggleSubtask.ToggleSubtaskOutput toggle(UUID id) {
        return toggleSubtaskSQL.toggle(id);
    }
}