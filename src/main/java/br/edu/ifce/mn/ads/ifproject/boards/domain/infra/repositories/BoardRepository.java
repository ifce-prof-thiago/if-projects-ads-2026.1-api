package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
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
}
