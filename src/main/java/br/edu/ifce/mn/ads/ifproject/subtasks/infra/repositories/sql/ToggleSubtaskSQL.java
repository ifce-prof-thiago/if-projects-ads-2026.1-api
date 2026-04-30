package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask.ToggleSubtaskOutput;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubtaskRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ToggleSubtaskSQL {

    private final static String SQL_TOGGLE = """
            UPDATE subtasks
            SET is_completed = NOT is_completed
            WHERE id = ?
            RETURNING id, is_completed
            """;

    private final JdbcTemplate jdbc;

    public ToggleSubtaskSQL(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public ToggleSubtaskOutput toggle(UUID id) {
        // TODO add Optimistic locking to avoid
        return jdbc.queryForObject(SQL_TOGGLE, (rs, rowNum) ->
                new ToggleSubtaskOutput(
                        rs.getString("id"),
                        rs.getBoolean("is_completed")
                ), id);
    }
}
