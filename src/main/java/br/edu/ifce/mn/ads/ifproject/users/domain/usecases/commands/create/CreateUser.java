package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.EmailAlreadyExistsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

@Component
public class CreateUser implements ICreateUser {

    private final IUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public CreateUser(IUserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public CreateUserOutput execute(CreateUserInput input) {
        if (repository.existsByEmail(input.email())) {
            throw new EmailAlreadyExistsException();
        }

        final var id = repository.persist(input, passwordEncoder.encode(input.password()));

        return new CreateUserOutput(id);
    }

}
