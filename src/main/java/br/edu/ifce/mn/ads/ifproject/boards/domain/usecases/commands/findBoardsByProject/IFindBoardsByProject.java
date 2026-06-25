package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@Validated
public interface IFindBoardsByProject {

    FindBoardsByProjectOutput execute(@Valid FindBoardsByProjectInput input);

    record FindBoardsByProjectInput(
            @NotNull(message = "O ID do projeto é obrigatório para realizar a listagem")
            UUID projectId
    ){}

    record FindBoardsByProjectOutput(
            List<BoardItem> boards
    ){}

    record BoardItem(
            UUID id,
            String name,
            String colorHex,
            boolean isArchived
    ){}

}
