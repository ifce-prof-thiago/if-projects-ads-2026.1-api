package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateUser implements IUpdateUser {

    private final IUserRepository repository;

    public UpdateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserOutput execute(UUID id, UpdateUserInput input) {
        if (!repository.update(id, input)) {
            throw new NotFoundException("User not found: " + id);
        }
        return new UpdateUserOutput(id);
    }
}
