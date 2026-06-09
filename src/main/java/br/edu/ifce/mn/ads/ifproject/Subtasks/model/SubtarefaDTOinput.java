package br.edu.ifce.mn.ads.ifproject.Subtasks.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SubtarefaDTOinput {
    private UUID taskID;
    private String texto;
    Integer posicao;

    public SubtarefaDTOinput(UUID taskID, String texto, Integer posicao) {
        this.taskID = taskID;
        this.texto = texto;
        this.posicao = posicao;
    }

    public UUID getTaskId() { return taskID; }

    public String getTexto() {
        return texto;
    }

    public Integer getPosicao() {
        return posicao;
    }
}
