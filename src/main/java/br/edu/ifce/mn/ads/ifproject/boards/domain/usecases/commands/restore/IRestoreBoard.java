package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.restore;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;

import java.util.UUID;

public interface IRestoreBoard {

    // Mesmo formato de saída do arquivamento: {id, name, isArchived}
    IArchiveBoard.ArchiveBoardOutput execute(UUID id);
}
