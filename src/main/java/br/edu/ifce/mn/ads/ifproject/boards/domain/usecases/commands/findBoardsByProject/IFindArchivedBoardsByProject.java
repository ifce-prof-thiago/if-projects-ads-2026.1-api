package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import java.util.UUID;

public interface IFindArchivedBoardsByProject {

    // Mesmo formato da listagem normal: {boards: [{id, name, colorHex, isArchived}]}
    IFindBoardsByProject.FindBoardsByProjectOutput execute(UUID projectId);
}
