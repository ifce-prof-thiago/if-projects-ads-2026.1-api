package br.edu.ifce.mn.ads.ifproject.board.infra.controllers;

import br.edu.ifce.mn.ads.ifproject.board.domain.model.Board;
import br.edu.ifce.mn.ads.ifproject.board.domain.usecase.archived.IArchivedBoard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final IArchivedBoard archivedBoard;

    public BoardController(IArchivedBoard archivedBoard) {
        this.archivedBoard = archivedBoard;
    }

    @PatchMapping("/{id}/archive")
    public ResponseEntity<Board> archiveBoard(@PathVariable UUID id) {
        try {
            Board boardArchived = archivedBoard.execute(id);
            return ResponseEntity.ok(boardArchived);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}