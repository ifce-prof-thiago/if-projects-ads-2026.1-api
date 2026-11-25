package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {
    UUID persist(ICreateUser.CreateUserInput input);

    // Retorna false se o usuário não existe.
    boolean update(UUID id, IUpdateUser.UpdateUserInput input);

    boolean exists(UUID id);

    boolean passwordMatches(UUID id, String password);

    void updatePassword(UUID id, String newPassword);

    // Retorna false se o usuário não existe.
    boolean activate(UUID id);

    Optional<IFindUser.UserOutput> findById(UUID id);

    Optional<IFindUser.UserOutput> findByEmail(String email);

    Optional<IFindUser.UserOutput> findByUsername(String username);
}
