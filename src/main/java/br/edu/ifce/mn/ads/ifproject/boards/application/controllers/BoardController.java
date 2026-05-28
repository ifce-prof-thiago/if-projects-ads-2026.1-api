package br.edu.ifce.mn.ads.ifproject.boards.application.controllers;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/boards")
public class BoardController {

    private final IArchiveBoard archiveBoard;

    // O Spring injeta a implementação do Caso de Uso aqui automaticamente
    public BoardController(IArchiveBoard archiveBoard) {
        this.archiveBoard = archiveBoard;
    }

    // Rota: PATCH http://localhost:8080/api/v1/boards/{board_id}/archive
    @PatchMapping("{board_id}/archive")
    public IArchiveBoard.ArchiveBoardOutput patch(
            @PathVariable("board_id") UUID id
    ) {
        // Passa o ID recebido na URL paraocaso de uso processar
        return archiveBoard.execute(id);
    }
}