package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateUser implements IUpdateUser{

    private final IUserRepository repository;

    public UpdateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserOutput execute(UUID id, UpdateUserInput input) {
        if (!repository.existsById(id)) {
            throw new UserNotFoundException();
        }
        final var userId = repository.persist(id, input);
        return new UpdateUserOutput(userId);
    }
}
