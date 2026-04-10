package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.ICreateUser;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

@Component
public class UserRepository implements IUserRepository {

    private final JdbcClient db;

    public UserRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public Long persist(ICreateUser.CreateUserInput input) {
        final var SQL = """
                    INSERT INTO users(username, email, password_hash) VALUES
                    (?, ?, md5(?))
                """;

        db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(input.password())
                .update();

        return 0L;
    }
}
