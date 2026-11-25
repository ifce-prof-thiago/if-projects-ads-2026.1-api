package br.edu.ifce.mn.ads.ifproject.subtasks.domain.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class SubtarefaDTOinput {
    // O nome original do campo é "taskID"; "taskId" é aceito como alias.
    @NotNull(message = "taskID (ou taskId) é obrigatório")
    private UUID taskID;
    private String texto;
    Integer posicao;

    public SubtarefaDTOinput(@JsonProperty("taskID") @JsonAlias("taskId") UUID taskID, String texto, Integer posicao) {
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
