package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.search_user;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.BadRequestException;
import br.edu.ifce.mn.ads.ifproject._commons.exceptions.NotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

@Component
public class SearchUser implements ISearchUser {

    private final IUserRepository repository;

    public SearchUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public IFindUser.UserOutput execute(String email, String username) {
        if (email != null && !email.isBlank()) {
            return repository.findByEmail(email.trim())
                    .orElseThrow(() -> new NotFoundException("User not found with email: " + email.trim()));
        }
        if (username != null && !username.isBlank()) {
            return repository.findByUsername(username.trim())
                    .orElseThrow(() -> new NotFoundException("User not found with username: " + username.trim()));
        }
        throw new BadRequestException("Informe o parâmetro email ou username");
    }
}
