package br.edu.ifce.mn.ads.ifproject.boards.application.controllers;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete.IDeleteBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate.IDuplicateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/boards")
public class BoardController {

    private final ICreateBoard createBoard;
    private final IReadBoard readBoard;
    private final IUpdateBoard updateBoard;
    private final IFindBoardsByProject findByProject;
    private final IDeleteBoard deleteBoard;
<<<<<<< HEAD
    private final IArchiveBoard archiveBoard;
=======
    private final IDuplicateBoard duplicateBoard;

    public record DuplicateBoardPayload(String newBoardName){}
>>>>>>> origin/feat/duplicateBoard

    public BoardController(
            ICreateBoard createBoard,
            IReadBoard readBoard,
            IUpdateBoard updateBoard,
            IFindBoardsByProject findByProject,
<<<<<<< HEAD
            IDeleteBoard deleteBoard, IArchiveBoard archiveBoard
=======
            IDeleteBoard deleteBoard,
            IDuplicateBoard duplicateBoard
>>>>>>> origin/feat/duplicateBoard
    ) {
        this.createBoard = createBoard;
        this.readBoard = readBoard;
        this.updateBoard = updateBoard;
        this.findByProject = findByProject;
        this.deleteBoard = deleteBoard;
<<<<<<< HEAD
        this.archiveBoard = archiveBoard;
=======
        this.duplicateBoard = duplicateBoard;
>>>>>>> origin/feat/duplicateBoard
    }

    @PostMapping
    public ICreateBoard.CreateBoardOutput post(@RequestBody ICreateBoard.CreateBoardInput input){
        return createBoard.execute(input);
    }

    @GetMapping(value = "/{id}")
    public IReadBoard.ReadBoardOutput get(@PathVariable UUID id){
        return readBoard.execute(new IReadBoard.ReadBoardInput(id));
    }

    @PatchMapping(value = "/{id}")
    public IUpdateBoard.UpdateBoardOutput patch(@PathVariable UUID id, @RequestBody IUpdateBoard.UpdateBoardInput input){
        return updateBoard.execute(id, input);
    }

    @GetMapping(value = "/project/{projectId}")
    public IFindBoardsByProject.FindBoardsByProjectOutput getByProjectId(@PathVariable UUID projectId){
        return findByProject.execute(new IFindBoardsByProject.FindBoardsByProjectInput(projectId));
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(
            @PathVariable UUID id,
            @RequestHeader("X-User-Id") UUID requesterId
    ){
        deleteBoard.execute(id, requesterId);
    }

<<<<<<< HEAD
    // Rota: PATCH http://localhost:8080/api/v1/boards/{board_id}/archive
    @PatchMapping("{board_id}/archive")
    public IArchiveBoard.ArchiveBoardOutput patch(
            @PathVariable("board_id") UUID id
    ) {
        // Passa o ID recebido na URL paraocaso de uso processar
        return archiveBoard.execute(id);
    }
}
=======
    @PostMapping(value = "/{id}/duplicate")
    @ResponseStatus(HttpStatus.CREATED)
    public IDuplicateBoard.DuplicateBoardOutput duplicate(
            @PathVariable UUID id,
            @RequestHeader("X-User-Id") UUID requesterId,
            @RequestBody DuplicateBoardPayload payload
    ){
        var input = new IDuplicateBoard.DuplicateBoardInput(
                id,
                payload.newBoardName(),
                requesterId
        );

        return duplicateBoard.execute(input);
    }
}
>>>>>>> origin/feat/duplicateBoard
