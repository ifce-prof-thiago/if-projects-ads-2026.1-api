package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject._commons.exceptions.ConflictException;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.queries.find_user.IFindUser;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class UserRepository implements IUserRepository {

    private static final String DUPLICATED = "Username ou e-mail já cadastrado";

    private static final RowMapper<IFindUser.UserOutput> USER_MAPPER = (rs, rowNum) -> new IFindUser.UserOutput(
            rs.getObject("id", UUID.class),
            rs.getString("username"),
            rs.getString("email")
    );

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

        try {
            return db.sql(SQL)
                    .param(input.username())
                    .param(input.email())
                    .param(input.password())
                    .query(UUID.class)
                    .single();
        } catch (DuplicateKeyException e) {
            throw new ConflictException(DUPLICATED);
        }
    }

    @Override
    public boolean update(UUID id, IUpdateUser.UpdateUserInput input) {
        final var SQL = """
                UPDATE users SET username = ?, email = ? WHERE id = ?
                """;

        try {
            return db.sql(SQL)
                    .param(input.username())
                    .param(input.email())
                    .param(id)
                    .update() > 0;
        } catch (DuplicateKeyException e) {
            throw new ConflictException(DUPLICATED);
        }
    }

    @Override
    public boolean exists(UUID id) {
        final var SQL = """
                SELECT EXISTS(SELECT 1 FROM users WHERE id = ?)
                """;
        return db.sql(SQL)
                .param(id)
                .query(Boolean.class)
                .single();
    }

    @Override
    public boolean passwordMatches(UUID id, String password) {
        final var SQL = """
                SELECT EXISTS(SELECT 1 FROM users WHERE id = ? AND password_hash = md5(?))
                """;
        return db.sql(SQL)
                .param(id)
                .param(password)
                .query(Boolean.class)
                .single();
    }

    @Override
    public void updatePassword(UUID id, String newPassword) {
        final var SQL = """
                UPDATE users SET password_hash = md5(?) WHERE id = ?
                """;

        db.sql(SQL)
                .param(newPassword)
                .param(id)
                .update();
    }

    @Override
    public boolean activate(UUID id) {
        final var SQL = """
                UPDATE users SET is_active = true WHERE id = ?
                """;
        return db.sql(SQL)
                .param(id)
                .update() > 0;
    }

    @Override
    public Optional<IFindUser.UserOutput> findById(UUID id) {
        final var SQL = """
                SELECT id, username, email FROM users WHERE id = ?
                """;
        return db.sql(SQL)
                .param(id)
                .query(USER_MAPPER)
                .optional();
    }

    @Override
    public Optional<IFindUser.UserOutput> findByEmail(String email) {
        final var SQL = """
                SELECT id, username, email FROM users WHERE lower(email) = lower(?)
                """;
        return db.sql(SQL)
                .param(email)
                .query(USER_MAPPER)
                .optional();
    }

    @Override
    public Optional<IFindUser.UserOutput> findByUsername(String username) {
        final var SQL = """
                SELECT id, username, email FROM users WHERE lower(username) = lower(?)
                """;
        return db.sql(SQL)
                .param(username)
                .query(USER_MAPPER)
                .optional();
    }
}
