package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserRepository implements IUserRepository {

    private final JdbcClient db;

    public UserRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public UUID persist(ICreateUser.CreateUserInput input) {
        final var SQL = """
                    INSERT INTO users(username, email, password_hash) VALUES
                    (?, ?, md5(?))
                    RETURNING id
                """;

        return db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(input.password())
                .query(UUID.class)
                .single();

    }

    @Override
    public Long persist(Long id, IUpdateUser.UpdateUserInput input) {
        final var SQL = """
                UPDATE users SET username = ?, email = ? WHERE id = ?
                """;

        db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(id)
                .update();
        return id;
    }

    @Override
    public Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input) {
        final var SQL = """
                UPDATE users SET password_hash = md5(?) WHERE id = ? AND password_hash = md5(?)
                """;

        db.sql(SQL)
                .param(input.newPassword())
                .param(id)
                .param(input.oldPassword())
                .update();

        return id;
    }

    @Override
    public Long active(Long id) {
        final var SQL = """
                UPDATE users SET is_active = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }
}
