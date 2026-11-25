package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ActivateUser implements IActivateUser {

    private final IUserRepository repository;

    public ActivateUser(IUserRepository repository) {

        this.repository = repository;
    }

    @Override
    public ActivateUserOutput execute(UUID id) {
        if (!repository.activate(id)) {
            throw new NotFoundException("User not found: " + id);
        }
        return new ActivateUserOutput(id);
    }
}
