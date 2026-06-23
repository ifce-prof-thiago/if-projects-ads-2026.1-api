package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BoardRepository implements IBoardRepository{

    private JdbcClient db;

    public BoardRepository(JdbcClient db) {
        this.db = db;
    }

    public UUID persist(ICreateBoard.CreateBoardInput input){
        final var SQL = "INSERT INTO boards (name, project_id) values (?,?) returning id";

        final var id = db.sql(SQL)
                .param(input.name())
                .param(input.projectId())
                .query(UUID.class)
                .single();

        return id;
    }

    public IReadBoard.ReadBoardOutput find(IReadBoard.ReadBoardInput input){
        final var SQL = "SELECT name, project_id, color_hex, is_archived FROM boards WHERE id = (?)";

        return db.sql(SQL)
                .param(input.id())
                .query((rs, rowNum) -> new IReadBoard.ReadBoardOutput(
                        rs.getString("name"),
                        rs.getObject("project_id", UUID.class),
                        rs.getString("color_hex"),
                        rs.getBoolean("is_archived")
                ))
                .single();
    }

    public UUID update(UUID id, IUpdateBoard.UpdateBoardInput input){

        final var SQL = "UPDATE boards set name = COALESCE(?, name), color_hex = COALESCE(?, color_hex) where id = (?)";

        db.sql(SQL)
                .param(input.name())
                .param(input.color())
                .param(id)
                .update();

        return id;
    }

    @Override
    public List<IFindBoardsByProject.BoardItem> findByProjectId(UUID projectId) {

        final var SQL = "SELECT id, name, color_hex, is_archived FROM boards WHERE project_id = (?) AND is_archived is false";

        return db.sql(SQL)
                .param(projectId)
                .query((rs, rowNum) -> new IFindBoardsByProject.BoardItem(
                        rs.getObject("id", UUID.class),
                        rs.getString("name"),
                        rs.getString("color_hex"),
                        rs.getBoolean("is_archived")
                ))
                .list();
    }

    @Override
    public boolean isUserAuthorizedToDelete(UUID boardId, UUID userId) {
        final var SQL = """
                SELECT EXISTS (
                    SELECT 1
                    FROM boards b
                    JOIN projects p ON b.project_id = p.id
                    LEFT JOIN project_members pm ON pm.project_id = p.id AND pm.user_id = ?
                    WHERE b.id = ? AND (p.owner_id = ? OR pm.role = 'ADMIN')
                )
                """;

        return db.sql(SQL)
                .param(userId)
                .param(boardId)
                .param(userId)
                .query(Boolean.class)
                .single();
    }

    @Override
    public void delete(UUID boardId) {
        final var SQL = "DELETE FROM boards WHERE id = (?)";

        db.sql(SQL)
                .param(boardId)
                .update();
    }

    public UUID duplicateBoardData(UUID originalBoardId, String newName){

        final var SQL = """
            INSERT INTO boards (name, project_id, color_hex, is_archived)
            SELECT ?, project_id, color_hex, false
            FROM boards WHERE id = ?
            RETURNING id
            """;;

        return db.sql(SQL)
                .param(newName)
                .param(originalBoardId)
                .query(UUID.class)
                .single();
    }

    public void duplicateTaskGroups(UUID originalBoardId, UUID newBoardId){

        final var SQL = """
            INSERT INTO task_groups (name, position, board_id)
            SELECT name, position, ?
            FROM task_groups WHERE board_id = ?
            """;

        db.sql(SQL)
                .param(newBoardId)
                .param(originalBoardId)
                .update();
    }

}
