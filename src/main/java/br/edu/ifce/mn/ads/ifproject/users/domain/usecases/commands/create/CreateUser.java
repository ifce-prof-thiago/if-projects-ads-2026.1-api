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

        // verifica se ja existe alguem com esse email antes de cadastrar
        if (repository.existsByEmail(input.email())) {
            throw new IllegalArgumentException("Esse e-mail ja esta sendo usado por outra conta");
        }

        // verifica se ja existe alguem com esse username antes de cadastrar
        if (repository.existsByUsername(input.username())) {
            throw new IllegalArgumentException("Esse username ja esta sendo usado por outra conta");
        }

        final var id = repository.persist(input);

        return new CreateUserOutput(id);
    }

}