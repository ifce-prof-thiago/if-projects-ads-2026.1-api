package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;

import java.util.List;
import java.util.UUID;

public interface IBoardRepository {

    UUID persist(ICreateBoard.CreateBoardInput input);

    IReadBoard.ReadBoardOutput find(IReadBoard.ReadBoardInput input);

    UUID update(UUID id, IUpdateBoard.UpdateBoardInput input);

    List<IFindBoardsByProject.BoardItem> findByProjectId(UUID projectId);

    boolean isUserAuthorizedToDelete(UUID boardId, UUID userId);
    void delete(UUID boardId);
}
