package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.search_user;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;

public interface ISearchUser {

    // Busca exata (sem diferenciar maiúsculas) por e-mail ou por username.
    IFindUser.UserOutput execute(String email, String username);
}
