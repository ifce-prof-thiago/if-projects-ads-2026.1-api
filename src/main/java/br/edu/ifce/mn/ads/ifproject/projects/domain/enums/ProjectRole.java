package br.edu.ifce.mn.ads.ifproject.projects.domain.enums;

public enum ProjectRole {
    OWNER,
    ADMIN,
    MEMBER,
    VIEWER;

    public boolean canEdit() {
        return this == OWNER || this == ADMIN;

    }

    public boolean isOwner() {
        return this == OWNER;

    }
}