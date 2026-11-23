package br.edu.ifce.mn.ads.ifproject.users.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 3, max = 10, message = "O nome de usuário deve ter entre 3 e 10 caracteres")
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface Username {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}