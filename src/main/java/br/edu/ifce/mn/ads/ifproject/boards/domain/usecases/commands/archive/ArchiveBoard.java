package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive;

import br.edu.ifce.mn.ads.ifproject.boards.domain.models.Board;
import br.edu.ifce.mn.ads.ifproject.boards.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ArchiveBoard implements IArchiveBoard {

    // Dependência do repositório de banco de dados
    private final IBoardRepository boardRepository;

    // Injeção de dependência por construtor
    public ArchiveBoard(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public ArchiveBoardOutput execute(UUID id) {
        // 1. Busca o quadro no banco pelo UUID. Se não achar, lança um erro.
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Quadro não encontrado com o ID: " + id));

        // 2. Aplica a regra de negócio: muda o status para arquivado (true)
        board.setArchived(true);

        // 3. Salva a alteração de volta no PostgreSQL
        Board updatedBoard = boardRepository.save(board);

        // 4. Devolve o Output
        return new ArchiveBoardOutput(
                updatedBoard.getId(),
                updatedBoard.getName(),
                updatedBoard.isArchived()
        );
    }
}