package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.ICreateUser;

public interface IUserRepository {

    Long persist(ICreateUser.CreateUserInput input);
}
