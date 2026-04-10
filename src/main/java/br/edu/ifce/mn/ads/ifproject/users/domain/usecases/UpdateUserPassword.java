package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserPassword implements IUpdateUserPassword {

    private final IUserRepository repository;

    public UpdateUserPassword(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserPasswordOutput execute(Long id, UpdateUserPasswordInput input) {
        final var userId = repository.persist(id, input);
        return new UpdateUserPasswordOutput(userId);
    }

}
