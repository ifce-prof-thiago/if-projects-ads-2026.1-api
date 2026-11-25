package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user;

import java.util.UUID;

public interface IFindUser {

    UserOutput execute(UUID id);

    // Nunca expõe a senha.
    record UserOutput(
            UUID id,
            String username,
            String email
    ) {
    }
}
