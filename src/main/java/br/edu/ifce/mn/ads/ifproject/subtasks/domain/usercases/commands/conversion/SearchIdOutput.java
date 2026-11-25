package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import java.util.UUID;

// task_id = tarefa-mãe da subtarefa; assignee_id e creator_id podem ser null.
public record SearchIdOutput(UUID assignee_id, UUID creator_id, UUID task_group_id, UUID task_id) {
}
