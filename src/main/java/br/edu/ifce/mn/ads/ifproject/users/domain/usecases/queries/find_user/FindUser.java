package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FindUser implements IFindUser {

    private final IUserRepository repository;

    public FindUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserOutput execute(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found: " + id));
    }
}
