package br.edu.ifce.mn.ads.ifproject._commons.http;

import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.Map;

public record ApiErrorResponse(
        int status,
        String error,
        String message,
        String timestamp,
        Map<String, String> fields
) {
    public static ApiErrorResponse of(HttpStatus status, String message) {
        return of(status, message, Map.of());
    }

    public static ApiErrorResponse of(HttpStatus status, String message, Map<String, String> fields) {
        return new ApiErrorResponse(
                status.value(),
                status.getReasonPhrase(),
                message,
                Instant.now().toString(),
                fields == null ? Map.of() : fields
        );
    }
}
