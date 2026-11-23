package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {
    Optional<AuthenticatedUserWithPassword> findByEmail(String email);

    Optional<AuthenticatedUserWithPassword> findById(UUID id);

    UUID persist(ICreateUser.CreateUserInput input, String passwordHash);

    UUID persist(UUID id, IUpdateUser.UpdateUserInput input);

    int updatePassword(UUID id, String passwordHash);

    UUID active(UUID id);

    boolean existsById(UUID id);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    record AuthenticatedUserWithPassword(
            UUID id,
            String username,
            String email,
            String passwordHash
    ) {
    }
}
