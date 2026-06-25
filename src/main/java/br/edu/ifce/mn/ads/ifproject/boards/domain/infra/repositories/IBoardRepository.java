package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;

import java.util.UUID;

public interface IBoardRepository {

    UUID persist(ICreateBoard.CreateBoardInput input);

    IReadBoard.ReadBoardOutput find(IReadBoard.ReadBoardInput input);
}
