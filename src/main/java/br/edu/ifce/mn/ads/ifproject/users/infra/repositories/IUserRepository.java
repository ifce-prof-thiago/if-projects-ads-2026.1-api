package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;

public interface IUserRepository {
    Long persist(ICreateUser.CreateUserInput input);

    Long persist(Long id, IUpdateUser.UpdateUserInput input);

    Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);

    Long active(Long id);

    // verificações de duplicidade para o cadastro
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}