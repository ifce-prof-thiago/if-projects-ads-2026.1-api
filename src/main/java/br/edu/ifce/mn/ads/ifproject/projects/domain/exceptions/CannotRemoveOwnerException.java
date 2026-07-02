package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

public class CannotRemoveOwnerException extends RuntimeException {

    public CannotRemoveOwnerException() {
        super("Cannot remove the owner from the project", null, true, false);

    }
}
