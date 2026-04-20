package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class SubtaskRepository implements ISubtaskRepository {
    private final JdbcTemplate jdbc;

    public SubtaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public SubtaskToggleResult toggle(UUID id) {
        final var sql = """
                UPDATE subtasks
                SET is_completed = NOT is_completed
                WHERE id = ?
                RETURNING id, is_completed
                """;

        return jdbc.queryForObject(sql, (rs, rowNum) ->
                new SubtaskToggleResult(
                        UUID.fromString(rs.getString("id")),
                        rs.getBoolean("is_completed")
                ), id);
    }
}