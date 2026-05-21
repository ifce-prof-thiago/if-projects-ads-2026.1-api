package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserRepository implements IUserRepository {

    private final JdbcClient db;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserRepository(JdbcClient db, BCryptPasswordEncoder passwordEncoder) {
        this.db = db;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Long persist(ICreateUser.CreateUserInput input) {
        // senha criptografada com bcrypt antes de salvar no banco
        final var SQL = """
                    INSERT INTO users(username, email, password_hash) VALUES
                    (?, ?, ?)
                    RETURNING id
                """;

        final var id = db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(passwordEncoder.encode(input.password()))
                .query(Long.class)
                .single();

        return id;
    }

    @Override
    public Long persist(Long id, IUpdateUser.UpdateUserInput input) {
        // verifica a senha atual e slv a nova senha criptografada com bcrypt
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
                UPDATE users SET password_hash = ? WHERE id = ? AND password_hash = ?
                """;

        db.sql(SQL)
                .param(passwordEncoder.encode(input.newPassword()))
                .param(id)
                .param(passwordEncoder.encode(input.oldPassword()))
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