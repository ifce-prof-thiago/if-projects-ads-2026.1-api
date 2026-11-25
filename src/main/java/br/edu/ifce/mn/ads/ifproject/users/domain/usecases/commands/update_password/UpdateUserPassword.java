package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.BadRequestException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateUserPassword implements IUpdateUserPassword {

    private final IUserRepository repository;

    public UpdateUserPassword(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserPasswordOutput execute(UUID id, UpdateUserPasswordInput input) {
        if (!repository.exists(id)) {
            throw new NotFoundException("User not found: " + id);
        }
        if (!repository.passwordMatches(id, input.oldPassword())) {
            throw new BadRequestException("Senha atual incorreta");
        }
        repository.updatePassword(id, input.newPassword());
        return new UpdateUserPasswordOutput(id);
    }

}
