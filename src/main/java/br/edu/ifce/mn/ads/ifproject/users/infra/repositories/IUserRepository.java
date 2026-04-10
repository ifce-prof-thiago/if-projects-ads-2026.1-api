package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.IUpdateUserPassword;

public interface IUserRepository {
    Long persist(ICreateUser.CreateUserInput input);

    Long persist(Long id, IUpdateUser.UpdateUserInput input);

    Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);

    Long active(Long id);
}
