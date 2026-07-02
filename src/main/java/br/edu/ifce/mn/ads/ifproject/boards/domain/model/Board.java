package br.edu.ifce.mn.ads.ifproject.board.domain.model;

import java.util.UUID;

public class Board {
    private UUID id;
    private String name;
    private boolean archived = false;
    private boolean isNew = true;

    
    public Board() {}

    public Board(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public void markAsNotNew() {
        this.isNew = false;
    }

    public void archived() {
        this.archived = true;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isNew() {
        return isNew;
    }
}