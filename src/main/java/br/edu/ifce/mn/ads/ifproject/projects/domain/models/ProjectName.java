package br.edu.ifce.mn.ads.ifproject.projects.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 2, max = 32)
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface ProjectName {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}