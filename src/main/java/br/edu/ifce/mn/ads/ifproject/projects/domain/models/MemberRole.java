package br.edu.ifce.mn.ads.ifproject.projects.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.RECORD_COMPONENT;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// Valores de ProjectRole.
@NotNull
@Pattern(regexp = "OWNER|ADMIN|MEMBER|VIEWER")
@ReportAsSingleViolation
@Target({FIELD, PARAMETER, RECORD_COMPONENT})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface MemberRole {
    String message() default "role deve ser OWNER, ADMIN, MEMBER ou VIEWER";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
