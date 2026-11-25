package br.edu.ifce.mn.ads.ifproject._commons.exceptions;

/** Vira HTTP 409 no ProjectExceptionHandler. */
public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message, null, true, false);
    }
}
