package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.deactivate;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class DeactivateUser implements IDeactivateUser {

    private final IUserRepository repository;

    public DeactivateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public DeactivateUserOutput execute(Long id) {
        // chamo o repositorio para desativar a conta do usuario com o id informado
        final var userId = repository.deactive(id);
        return new DeactivateUserOutput(userId);
    }
}