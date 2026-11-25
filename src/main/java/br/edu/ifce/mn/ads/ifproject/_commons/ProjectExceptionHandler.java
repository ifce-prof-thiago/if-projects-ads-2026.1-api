package br.edu.ifce.mn.ads.ifproject._commons;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.BadRequestException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.ConflictException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.*;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tools.jackson.databind.exc.InvalidFormatException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Handler único da API. Todo erro sai no formato
 * {status, error, message, timestamp, validationErrors?}.
 */
@RestControllerAdvice
public class ProjectExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(ProjectExceptionHandler.class);

    // ---- 404 ----

    @ExceptionHandler({
            ProjectNotFoundException.class,
            MemberNotFoundException.class,
            NotFoundException.class,
            ResourceNotFoundException.class
    })
    public ResponseEntity<Object> handleNotFound(RuntimeException ex) {
        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Object> handle(EmptyResultDataAccessException ex) {
        return buildResponse(HttpStatus.NOT_FOUND, "Recurso não encontrado");
    }

    // ---- 409 ----

    @ExceptionHandler({
            ProjectAlreadyArchivedException.class,
            ProjectNotArchivedException.class,
            MemberAlreadyExistsException.class,
            ConflictException.class
    })
    public ResponseEntity<Object> handleConflict(RuntimeException ex) {
        return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
    }

    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<Object> handle(DuplicateKeyException ex) {
        return buildResponse(HttpStatus.CONFLICT, "Registro duplicado");
    }

    // ---- 422 ----

    @ExceptionHandler({CannotRemoveOwnerException.class, CannotTransferToNonMemberException.class})
    public ResponseEntity<Object> handleUnprocessable(RuntimeException ex) {
        return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, ex.getMessage());
    }

    // ---- 403 ----

    @ExceptionHandler(InsufficientPermissionException.class)
    public ResponseEntity<Object> handle(InsufficientPermissionException ex) {
        return buildResponse(HttpStatus.FORBIDDEN, ex.getMessage());
    }

    // ---- 400 ----

    @ExceptionHandler({BadRequestException.class, BusinessRuleException.class})
    public ResponseEntity<Object> handleBadRequest(RuntimeException ex) {
        return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> handle(DataIntegrityViolationException ex) {
        log.warn("Violação de integridade: {}", ex.getMostSpecificCause().getMessage());
        return buildResponse(HttpStatus.BAD_REQUEST,
                "Dados inválidos: campo obrigatório ausente, valor fora do permitido ou referência inexistente");
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handle(ConstraintViolationException ex) {
        Map<String, String> validationErrors = new HashMap<>();
        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            String path = violation.getPropertyPath().toString();
            String field = path.substring(path.lastIndexOf('.') + 1);
            addValidationError(validationErrors, field, violation.getMessage());
        }
        return buildValidationResponse(validationErrors);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, String> validationErrors = new HashMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            addValidationError(validationErrors, error.getField(), error.getDefaultMessage());
        }
        return buildValidationResponse(validationErrors);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(
            HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        if (ex.getCause() instanceof InvalidFormatException invalidFormat
                && invalidFormat.getTargetType() != null
                && invalidFormat.getTargetType().isEnum()
                && !invalidFormat.getPath().isEmpty()) {
            final var field = invalidFormat.getPath().getFirst().getPropertyName();
            return buildResponse(HttpStatus.BAD_REQUEST, "Valor inválido para " + field);
        }
        return buildResponse(HttpStatus.BAD_REQUEST, "Valor inválido");
    }

    // Demais exceções do Spring MVC (405, 404 de rota, 415, tipo de parâmetro, header faltando...)
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception ex, Object body, HttpHeaders headers, HttpStatusCode statusCode, WebRequest request) {
        String message = ex.getMessage();
        if (body instanceof ProblemDetail problem && problem.getDetail() != null) {
            message = problem.getDetail();
        }
        return buildResponse(HttpStatus.valueOf(statusCode.value()), message);
    }

    // ---- 500 ----

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleUnexpected(Exception ex) {
        log.error("Erro não tratado", ex);
        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno no servidor");
    }

    private void addValidationError(Map<String, String> errors, String field, String message) {
        errors.merge(field, message, (existing, next) -> existing + "; " + next);
    }

    private ResponseEntity<Object> buildValidationResponse(Map<String, String> validationErrors) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", status.value());
        body.put("error", status.getReasonPhrase());
        body.put("message", "Validation failed");
        body.put("validationErrors", validationErrors);
        body.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(status).body(body);
    }

    private ResponseEntity<Object> buildResponse(HttpStatus status, String message) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", status.value());
        body.put("error", status.getReasonPhrase());
        body.put("message", message != null ? message : status.getReasonPhrase());
        body.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(status).body(body);
    }
}
