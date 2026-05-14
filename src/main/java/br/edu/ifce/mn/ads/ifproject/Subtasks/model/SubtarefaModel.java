package br.edu.ifce.mn.ads.ifproject.Subtasks.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SubtarefaModel {
    private UUID id;
    private UUID taskID;
    private String texto;
    Integer posicao;
    boolean status;
    OffsetDateTime data;

    public UUID getId() {return id;}
    public void setId(UUID id) {this.id = id;}

    public UUID getTaskId() { return taskID; }
    public void setTaskId(UUID taskID) { this.taskID = taskID; }

    public String getTexto() {return texto;}
    public void setTexto(String texto) {this.texto = texto;}

    public Integer getPosicao() {return posicao;}
    public void setPosicao(Integer posicao) {this.posicao = posicao;}

    public boolean getStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    public OffsetDateTime getData() { return data; }
    public void setData(OffsetDateTime data) { this.data = data; }
}
