package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class UserRepository implements IUserRepository {

    private final JdbcClient db;

    public UserRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public Optional<AuthenticatedUserWithPassword> findByEmail(String email) {
        final var SQL = """
                SELECT id, username, email, password_hash
                FROM users
                WHERE lower(email) = lower(?)
                  AND is_active = true
                """;

        return db.sql(SQL)
                .param(email)
                .query(AuthenticatedUserWithPassword.class)
                .optional();
    }

    @Override
    public Optional<AuthenticatedUserWithPassword> findById(UUID id) {
        final var sql = """
                SELECT id, username, email, password_hash
                FROM users
                WHERE id = ?
                """;
        return db.sql(sql)
                .param(id)
                .query(AuthenticatedUserWithPassword.class)
                .optional();
    }

    @Override
    public UUID persist(ICreateUser.CreateUserInput input, String passwordHash) {
        final var SQL = """
                    INSERT INTO users(username, email, password_hash) VALUES
                    (?, ?, ?)
                    RETURNING id
                """;

        return db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(passwordHash)
                .query(UUID.class)
                .single();

    }

    @Override
    public UUID persist(UUID id, IUpdateUser.UpdateUserInput input) {
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
    public int updatePassword(UUID id, String passwordHash) {
        final var SQL = """
                UPDATE users SET password_hash = ? WHERE id = ?
                """;

        return db.sql(SQL)
                .param(passwordHash)
                .param(id)
                .update();
    }

    @Override
    public UUID active(UUID id) {
        final var SQL = """
                UPDATE users SET is_active = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public boolean existsById(UUID id) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE id = ?)")
                .param(id)
                .query(Boolean.class)
                .single();
    }

    @Override
    public boolean existsByEmail(String email) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE lower(email) = lower(?))")
                .param(email)
                .query(Boolean.class)
                .single();
    }
}
