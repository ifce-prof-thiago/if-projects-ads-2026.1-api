package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IDuplicateBoard {

    DuplicateBoardOutput execute(@Valid DuplicateBoardInput input);

    record DuplicateBoardInput(
            @NotNull
            UUID originalBoardId,

            @NotBlank
            String newBoardName,

            @NotNull
            UUID requesterId
    ){}

    record DuplicateBoardOutput(
            UUID newBoardId
    ){}

}
