package br.edu.ifce.mn.ads.ifproject.subtasks.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SubtarefaDTOoutput {
    private UUID id;
    private UUID taskID;
    private String texto;
    Integer posicao;
    boolean status;
    OffsetDateTime data;

    public SubtarefaDTOoutput(UUID id, UUID taskID, String texto, Integer posicao,
                             boolean status, OffsetDateTime data) {
        this.id = id;
        this.taskID = taskID;
        this.texto = texto;
        this.posicao = posicao;
        this.status = status;
        this.data = data;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTaskId() { return taskID; }

    public String getTexto() {
        return texto;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public boolean getStatus() {
        return status;
    }

    public OffsetDateTime getData() { return data; }
}
