package br.edu.ifce.mn.ads.ifproject._commons.exceptions;

/** Vira HTTP 400 no ProjectExceptionHandler. */
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message, null, true, false);
    }
}
