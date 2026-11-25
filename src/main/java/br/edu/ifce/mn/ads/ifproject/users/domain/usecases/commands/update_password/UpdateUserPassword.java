package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.BadRequestException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

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
        final var currentHash = repository.findPasswordHash(id)
                .orElseThrow(() -> new NotFoundException("User not found: " + id));

        if (!oldPasswordMatches(id, currentHash, input.oldPassword())) {
            throw new BadRequestException("Senha atual incorreta");
        }
        repository.updatePasswordHash(id, passwordEncoder.encode(input.newPassword()));
        return new UpdateUserPasswordOutput(id);
    }

    // Usuários antigos têm hash md5; os novos, BCrypt ("$2a$...").
    private boolean oldPasswordMatches(UUID id, String currentHash, String oldPassword) {
        if (oldPassword == null) {
            return false;
        }
        if (currentHash.startsWith("$2")) {
            return passwordEncoder.matches(oldPassword, currentHash);
        }
        return repository.legacyMd5Matches(id, oldPassword);
    }

}
