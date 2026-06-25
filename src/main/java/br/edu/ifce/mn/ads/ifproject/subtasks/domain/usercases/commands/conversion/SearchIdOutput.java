package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import java.util.UUID;

public record SearchIdOutput(UUID assignee_id, UUID creator_id, UUID task_group_id) {
}
