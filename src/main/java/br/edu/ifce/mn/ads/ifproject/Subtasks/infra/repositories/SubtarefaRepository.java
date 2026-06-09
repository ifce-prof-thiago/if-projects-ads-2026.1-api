package br.edu.ifce.mn.ads.ifproject.Subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaDTOoutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

@Repository
public class SubtarefaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void criar(SubtarefaDTOinput dto){
        String sql = "INSERT INTO subtasks (id, task_id, description, position, is_completed, created_at) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                UUID.randomUUID(),
                dto.getTaskId(),
                dto.getTexto(),
                dto.getPosicao(),
                false,
                Timestamp.from(Instant.now()));
    }

    public List<SubtarefaDTOoutput> listarPorTarefa(UUID taskId) {
        String sql = "SELECT id, task_id, description, position, is_completed, created_at " +
                "FROM subtasks WHERE task_id = ?";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
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
        jdbcTemplate.update(sql, novoTexto, id);
    }

    public void editarStatus(UUID id, Boolean novoStatus) {
        String sql = "UPDATE subtasks SET is_completed = ? WHERE id = ?";
        jdbcTemplate.update(sql, novoStatus, id);
    }

    public void editarPosicao(UUID id, Integer novaPosicao) {
        String sql = "UPDATE subtasks SET position = ? WHERE id = ?";
        jdbcTemplate.update(sql, novaPosicao, id);
    }

    public void remover(UUID id) {
        String sql = "DELETE FROM subtasks WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
