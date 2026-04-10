package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class UpdateUser implements IUpdateUser{

    private final IUserRepository repository;

    public UpdateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserOutput execute(Long id, UpdateUserInput input) {
        final var userId = repository.persist(id, input);
        return new UpdateUserOutput(userId);
    }
}
