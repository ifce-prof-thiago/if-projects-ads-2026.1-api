package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateBoard {

    UpdateBoardOutput execute (UUID id, @Valid UpdateBoardInput input);

    record UpdateBoardInput(
            @Size(min = 3, max = 30)
            String name,
            String color
    ){}

    record UpdateBoardOutput(
            UUID id
    ){}

}
