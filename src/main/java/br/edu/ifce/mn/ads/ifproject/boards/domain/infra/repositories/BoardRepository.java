package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

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

}
