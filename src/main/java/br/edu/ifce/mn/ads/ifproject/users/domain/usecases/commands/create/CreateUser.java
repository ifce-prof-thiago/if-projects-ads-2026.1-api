package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateUser implements ICreateUser {

    private final IUserRepository repository;

    public CreateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateUserOutput execute(CreateUserInput input) {

        final var id = repository.persist(input);

        return new CreateUserOutput(id);
    }

}
