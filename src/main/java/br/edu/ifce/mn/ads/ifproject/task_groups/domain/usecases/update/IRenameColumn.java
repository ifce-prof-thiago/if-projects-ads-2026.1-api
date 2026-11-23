package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IRenameColumn {

    RenameColumnOutput execute(UUID id, @Valid RenameColumnInput input);

    record RenameColumnInput(
            @NotBlank(message = "O nome da coluna é obrigatório")
            @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
            String name
    ){

    }
    record RenameColumnOutput(
        UUID id
    ){

    }
}
