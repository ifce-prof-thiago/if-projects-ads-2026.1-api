package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.model.SubtarefaDTOoutput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.SubtaskRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtaskController {
    private final IToggleSubtask toggleSubtask;
    private final IConversionSubTasks conversionSubTasks;
    private final SubtaskRepository subtarefaRepository;

    public SubtaskController(
            IToggleSubtask toggleSubtask,
            IConversionSubTasks conversionSubTasks,
            SubtaskRepository subtarefaRepository
    ) {
        this.toggleSubtask = toggleSubtask;
        this.conversionSubTasks = conversionSubTasks;
        this.subtarefaRepository = subtarefaRepository;
    }

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody SubtarefaDTOinput input) {
        subtarefaRepository.criar(input);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/conversion")
    public void conversionSubtask(@RequestBody @Valid ConvertToTaskInput input) {
        conversionSubTasks.execute(input);
    }

    @PatchMapping("{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }

    @PatchMapping("{id}/texto")
    public ResponseEntity<Void> editarTexto(@PathVariable UUID id, @RequestParam String texto) {
        subtarefaRepository.editarTexto(id, texto);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("{id}/status")
    public ResponseEntity<Void> editarStatus(@PathVariable UUID id, @RequestParam boolean status) {
        subtarefaRepository.editarStatus(id, status);
        return ResponseEntity.ok().build();
    }

    // "/task-groups/{taskId}" é a rota original (recebe o id da TAREFA); "/task/{taskId}" é um alias.
    @GetMapping({"/task-groups/{taskId}", "/task/{taskId}"})
    public ResponseEntity<List<SubtarefaDTOoutput>> listar(@PathVariable UUID taskId) {
        List<SubtarefaDTOoutput> lista = subtarefaRepository.listarPorTarefa(taskId);
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        subtarefaRepository.remover(id);
        return ResponseEntity.ok().build();
    }
}
