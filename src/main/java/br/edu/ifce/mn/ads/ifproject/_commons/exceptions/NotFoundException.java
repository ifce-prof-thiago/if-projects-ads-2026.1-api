package br.edu.ifce.mn.ads.ifproject._commons.exceptions;

/** Vira HTTP 404 no ProjectExceptionHandler. */
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message, null, true, false);
    }
}
