package br.edu.ifce.mn.ads.ifproject.subtasks.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SubtarefaDTOinput {
    private UUID taskId;
    private String texto;

    public SubtarefaDTOinput(UUID taskId, String texto) {
        this.taskId = taskId;
        this.texto = texto;
    }

    public UUID getTaskId() { return taskId; }

    public String getTexto() {
        return texto;
    }
}
