package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateBoard {

    CreateBoardOutput execute(@Valid CreateBoardInput input);

    record CreateBoardInput(
            @NotBlank(message = "O nome do quadro é obrigatório e não pode ser vazio")
            @Size(min = 3, max = 30)
            String name,

            @NotNull(message = "O id do projeto é obrigatório")
            UUID projectId
    )
    {}

    record CreateBoardOutput(
            UUID id
    )
    {}

}
