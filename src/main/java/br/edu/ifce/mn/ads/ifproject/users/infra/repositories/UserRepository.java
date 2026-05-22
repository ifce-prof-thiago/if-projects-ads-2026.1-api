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
        // pega a senha e transforma em BCrypt antes de salvar, p nao ficar exposta no banco
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
        // verifica a senha antiga e ja salvo a nova criptografada com BCrypt
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

    @Override
    public boolean existsByEmail(String email) {
        // verifica se ja tem alguem cadastrado com esse email antes de deixar criar a conta
        final var SQL = """
                SELECT COUNT(*) FROM users WHERE email = ?
                """;
        final var count = db.sql(SQL)
                .param(email)
                .query(Long.class)
                .single();
        return count > 0;
    }

    @Override
    public boolean existsByUsername(String username) {
        // verificoa se ja tem alguem usando esse username antes de deixar criar a conta
        final var SQL = """
                SELECT COUNT(*) FROM users WHERE username = ?
                """;
        final var count = db.sql(SQL)
                .param(username)
                .query(Long.class)
                .single();
        return count > 0;
    }
}