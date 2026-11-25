package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.model.SubtarefaDTOoutput;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

@Repository
public class SubtaskRepository implements ISubtaskRepository {
    private final JdbcTemplate jdbc;

    public SubtaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void criar(SubtarefaDTOinput dto) {
        String sql = "INSERT INTO subtasks (id, task_id, description, position, is_completed, created_at) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbc.update(sql,
                UUID.randomUUID(),
                dto.getTaskId(),
                dto.getTexto(),
                dto.getPosicao(),
                false,
                Timestamp.from(Instant.now()));
    }

    public List<SubtarefaDTOoutput> listarPorTarefa(UUID taskId) {
        String sql = "SELECT id, task_id, description, position, is_completed, created_at " +
                "FROM subtasks WHERE task_id = ? ORDER BY position ASC, created_at ASC";

        return jdbc.query(sql, (rs, rowNum) -> {
            Timestamp dbTimestamp = rs.getTimestamp("created_at");

            OffsetDateTime dataFormatada = null;
            if (dbTimestamp != null) {
                dataFormatada = dbTimestamp.toInstant().atOffset(ZoneOffset.UTC);
            }

            return new SubtarefaDTOoutput(
                    UUID.fromString(rs.getString("id")),
                    UUID.fromString(rs.getString("task_id")),
                    rs.getString("description"),
                    rs.getInt("position"),
                    rs.getBoolean("is_completed"),
                    dataFormatada
            );
        }, taskId);
    }

    public void editarTexto(UUID id, String novoTexto) {
        String sql = "UPDATE subtasks SET description = ? WHERE id = ?";
        jdbc.update(sql, novoTexto, id);
    }

    public void editarStatus(UUID id, Boolean novoStatus) {
        String sql = "UPDATE subtasks SET is_completed = ? WHERE id = ?";
        jdbc.update(sql, novoStatus, id);
    }

    public void editarPosicao(UUID id, Integer novaPosicao) {
        String sql = "UPDATE subtasks SET position = ? WHERE id = ?";
        jdbc.update(sql, novaPosicao, id);
    }

    public void remover(UUID id) {
        String sql = "DELETE FROM subtasks WHERE id = ?";
        jdbc.update(sql, id);
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