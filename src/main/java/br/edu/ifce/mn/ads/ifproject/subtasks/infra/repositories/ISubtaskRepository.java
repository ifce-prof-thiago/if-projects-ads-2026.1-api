package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;

import java.util.UUID;

public interface ISubtaskRepository {
    IToggleSubtask.ToggleSubtaskOutput toggle(UUID id);
}