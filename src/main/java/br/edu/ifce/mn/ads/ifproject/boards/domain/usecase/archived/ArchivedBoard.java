package br.edu.ifce.mn.ads.ifproject.board.domain.usecase.archived;

import br.edu.ifce.mn.ads.ifproject.board.domain.model.Board;
import br.edu.ifce.mn.ads.ifproject.board.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.Optional;

@Component
public class ArchivedBoard implements IArchivedBoard {
    private final IBoardRepository boardRepository;

    public ArchivedBoard(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board execute(UUID id) {
        Optional<Board> optionalBoard = boardRepository.findById(id);

        if (optionalBoard.isEmpty()) {
            throw new RuntimeException("Board not found");
        }

        Board board = optionalBoard.get();


        board.archived();

        return boardRepository.save(board);
    }
}