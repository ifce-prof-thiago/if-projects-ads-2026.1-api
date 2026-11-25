package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {
    // passwordHash já vem codificado (BCrypt)
    UUID persist(ICreateUser.CreateUserInput input, String passwordHash);

    // Retorna false se o usuário não existe.
    boolean update(UUID id, IUpdateUser.UpdateUserInput input);

    boolean exists(UUID id);

    Optional<String> findPasswordHash(UUID id);

    // Compatibilidade com senhas antigas gravadas em md5 pelo banco.
    boolean legacyMd5Matches(UUID id, String password);

    void updatePasswordHash(UUID id, String passwordHash);

    // Retorna false se o usuário não existe.
    boolean activate(UUID id);

    Optional<IFindUser.UserOutput> findById(UUID id);

    Optional<IFindUser.UserOutput> findByEmail(String email);

    Optional<IFindUser.UserOutput> findByUsername(String username);
}
