package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.conversion.SearchIdOutput;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOoutput;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class SubtaskRepository implements ISubtaskRepository {
    private final JdbcTemplate jdbc;
    private final JdbcClient db;

    public SubtaskRepository(JdbcTemplate jdbc, JdbcClient db) {
        this.jdbc = jdbc;
        this.db = db;
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

    @Override
    public UUID persistNewTask(ConvertToTaskInput input) {

        final var SQL = """
                INSERT INTO tasks
                (task_group_id, creator_id, assignee_id, title, position, is_archived, created_at) VALUES (?, ?, ?, ?, ?, ?, ?) RETURNING id
                """;
        return db.sql(SQL).params(input.task_group_id(), input.creator_id(), input.assignee_id(), input.title(), input.position(), input.is_archived(), input.created_at()).query(UUID.class).single();

    }

    @Override
    public Optional<SearchIdOutput> findParentTaskInfo(UUID id) {

        final var SQL = """
                SELECT t.task_group_id, t.creator_id, t.assignee_id, st.task_id, st.description
                FROM subtasks st JOIN tasks t ON st.task_id = t.id
                WHERE st.id = ?
                """;

        return db.sql(SQL).param(id).query(
                (rs, rowNum) -> {
                    return new SearchIdOutput(
                            UUID.fromString(rs.getString("assignee_id")),
                            UUID.fromString(rs.getString("creator_id")),
                            UUID.fromString(rs.getString("task_group_id")),
                            UUID.fromString(rs.getString("task_id")),
                            rs.getString("description"));}
        ).optional();
    }

    @Override
    public void removeSubtask(UUID id) {

        final var SQL = """
               DELETE FROM subtasks
               WHERE id = ?
               """;

        db.sql(SQL).param(id).update();
    }

    public int lastPositionTask(){

        final var SQL = """
                SELECT MAX(position) FROM task_groups
                """;

        return db.sql(SQL).query(Integer.class).single();
    }

    @Override
    public boolean isCompletedSubtask(UUID id){

        final var SQL = """
                SELECT is_completed FROM subtasks WHERE id = ?
                """;
        return db.sql(SQL).param(id).query(Boolean.class).single();

    }

    @Override
    public void updatePositionSubtasksAfterConversion(int position, UUID taskId) {

        final var SQL = """
                UPDATE subtasks SET position = position - 1 WHERE position > ? AND task_id = ?
                """;

        db.sql(SQL).param(position).param(taskId).update();
    }

    @Override
    public int getPositionConvertedSubtask(UUID id) {

        final var SQL = """
                SELECT position FROM subtasks WHERE id = ?
                """;

        return db.sql(SQL).param(id).query(Integer.class).single();
    }

    public void criar(SubtarefaDTOinput dto){
        String sql = "INSERT INTO subtasks (id, task_id, description, position, is_completed, created_at) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        int maxPosition = db.sql("""
                SELECT COALESCE(MAX(position), 0) FROM subtasks WHERE task_id = ?
                """).param(dto.getTaskId()).query(Integer.class).single();

        jdbc.update(sql,
                UUID.randomUUID(),
                dto.getTaskId(),
                dto.getTexto(),
                maxPosition + 1,
                false,
                Timestamp.from(Instant.now()));
    }

    public List<SubtarefaDTOoutput> listarPorTarefa(UUID taskId) {
        String sql = "SELECT id, task_id, description, position, is_completed, created_at " +
                "FROM subtasks WHERE task_id = ?";

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

        //updates positions following the removed subtask
        db.sql("""
                    UPDATE subtasks
                    SET position = position - 1
                    WHERE task_id = (
                        SELECT task_id
                        FROM subtasks
                        WHERE id = ?
                    )
                    AND position > (
                        SELECT position
                        FROM subtasks
                        WHERE id = ?
                    )
                """).param(id).param(id).update();

        String sql = "DELETE FROM subtasks WHERE id = ?";
        jdbc.update(sql, id);
    }
}