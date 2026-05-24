package br.edu.ifce.mn.ads.ifproject.subtasks.application.exceptions;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tools.jackson.databind.exc.InvalidFormatException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public static Map<String, String> globalExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String field = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();

            errors.put(field, errorMessage);
        });

        return errors;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public static Map<String, String> globalExceptions(ResourceNotFoundException ex) {
        return Map.of("error", ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BusinessRuleException.class)
    public static Map<String, String> globalExceptions(BusinessRuleException ex) {
        return Map.of("error", ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public static Map<String, String> globalExceptions(HttpMessageNotReadableException ex) {

        Throwable cause = ex.getCause();

        if(cause instanceof InvalidFormatException invalidFormat){

            if(invalidFormat.getTargetType().isEnum() && invalidFormat.getPath().getFirst().getPropertyName().equals("priority")){
                return Map.of("error", "Valor inválido para priority");
            }
        }

        return Map.of("error", "Valor inválido");

    }
}
