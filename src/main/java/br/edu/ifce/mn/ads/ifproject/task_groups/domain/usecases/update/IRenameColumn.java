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
            @NotBlank @Size(min = 3, max = 30)
            String name
    ){

    }
    record RenameColumnOutput(
        UUID id
    ){

    }
}
