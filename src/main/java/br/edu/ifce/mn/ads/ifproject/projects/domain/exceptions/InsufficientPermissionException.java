package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

public class InsufficientPermissionException extends RuntimeException {

    public InsufficientPermissionException() {
        super("Insufficient permission to perform this action", null, false, false);

    }
}