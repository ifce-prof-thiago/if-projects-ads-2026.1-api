package br.edu.ifce.mn.ads.ifproject.boards.application.controllers;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/boards")
public class BoardController {

    private final ICreateBoard createBoard;

    public BoardController(ICreateBoard createBoard) {
        this.createBoard = createBoard;
    }

    @PostMapping
    public ICreateBoard.CreateBoardOutput post(@RequestBody ICreateBoard.CreateBoardInput input){
        return createBoard.execute(input);
    }
}
