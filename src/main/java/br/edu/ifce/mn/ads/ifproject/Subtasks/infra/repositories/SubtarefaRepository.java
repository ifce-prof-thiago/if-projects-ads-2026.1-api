package br.edu.ifce.mn.ads.ifproject.Subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

@Repository
public class SubtarefaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void adicionar(SubtarefaDTO dto){
        String sql = "INSERT INTO subtasks (id, task_id, description, position, is_completed, created_at) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, dto.getId(), dto.getTaskId(), dto.getTexto(),
                dto.getPosicao(), false);
    }

    public List<SubtarefaDTO> listarPorTarefa(UUID taskId) {
        String sql = "SELECT id, task_id, description, position, is_completed, created_at " +
                "FROM subtasks WHERE task_id = ?";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Timestamp dbTimestamp = rs.getTimestamp("created_at");

            OffsetDateTime dataFormatada = null;
            if (dbTimestamp != null) {
                dataFormatada = dbTimestamp.toInstant().atOffset(ZoneOffset.UTC);
            }

            return new SubtarefaDTO(
                    UUID.fromString(rs.getString("id")),
                    UUID.fromString(rs.getString("task_id")),
                    rs.getString("description"),
                    rs.getInt("position"),
                    rs.getBoolean("is_completed"),
                    dataFormatada
            );
        }, taskId);
    }

    public void editarTexto(SubtarefaDTO dto){
        String sql = "UPDATE subtasks SET description = ? WHERE id = ?";
        jdbcTemplate.update(sql, dto.getTexto(), dto.getId());
    }

    public void remover(SubtarefaDTO dto){
        String sql = "DELETE FROM subtasks WHERE id = ?";
        jdbcTemplate.update(sql, dto.getId());
    }

    public void editarStatus(SubtarefaDTO dto){
        String sql = "UPDATE subtasks SET is_completed = ? WHERE id = ?";
        jdbcTemplate.update(sql, dto.getStatus() ,dto.getId());
    }

    public void editarPosicao(SubtarefaDTO dto){
        String sql = "UPDATE subtasks SET position = ? WHERE id = ?";
        jdbcTemplate.update(sql, dto.getPosicao(), dto.getId());
    }
}
