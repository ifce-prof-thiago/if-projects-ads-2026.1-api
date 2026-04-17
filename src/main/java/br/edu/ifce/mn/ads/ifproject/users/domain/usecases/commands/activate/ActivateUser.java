package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class ActivateUser implements IActivateUser {

    private final IUserRepository repository;

    public ActivateUser(IUserRepository repository) {

        this.repository = repository;
    }

    @Override
    public ActivateUserOutput execute(Long id) {
        final var userId = repository.active(id);
        return new ActivateUserOutput(userId);
    }
}
