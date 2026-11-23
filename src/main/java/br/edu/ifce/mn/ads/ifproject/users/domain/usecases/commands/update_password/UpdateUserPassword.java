package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCurrentPasswordException;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@Component
public class UpdateUserPassword implements IUpdateUserPassword {

    private final IUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UpdateUserPassword(IUserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UpdateUserPasswordOutput execute(UUID id, UpdateUserPasswordInput input) {
        final var user = repository.findById(id).orElseThrow(UserNotFoundException::new);
        if (!passwordEncoder.matches(input.oldPassword(), user.passwordHash())) {
            throw new InvalidCurrentPasswordException();
        }
        repository.updatePassword(id, passwordEncoder.encode(input.newPassword()));
        return new UpdateUserPasswordOutput(id);
    }

}
