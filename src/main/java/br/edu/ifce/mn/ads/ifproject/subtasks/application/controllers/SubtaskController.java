package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.conversion.IConversionSubTasks;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubtaskRepository;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOoutput;
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
    private final ISubtaskRepository subtaskRepository;

    public SubtaskController(IToggleSubtask toggleSubtask, IConversionSubTasks conversionSubTasks, ISubtaskRepository subtaskRepository) {
        this.toggleSubtask = toggleSubtask;
        this.conversionSubTasks = conversionSubTasks;
        this.subtaskRepository = subtaskRepository;

    }

    @PatchMapping("{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }

    @PostMapping("/{subtask_id}/convert-int-task")
    public void conversionSubtask(@PathVariable UUID subtask_id) {
        conversionSubTasks.execute(new IConversionSubTasks.ConversionSubtaskInput(subtask_id));
    }

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody SubtarefaDTOinput input){
        subtaskRepository.criar(input);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/task-groups/{taskId}")
    public ResponseEntity<List<SubtarefaDTOoutput>> listar(@PathVariable UUID taskId){
        List<SubtarefaDTOoutput> lista = subtaskRepository.listarPorTarefa(taskId);
        return ResponseEntity.ok(lista);
    }

    @PatchMapping("{id}/texto")
    public ResponseEntity<Void> editarTexto(@PathVariable UUID id, @RequestParam String texto){
        subtaskRepository.editarTexto(id, texto);
        return ResponseEntity.ok().build();
    }

    @PatchMapping ("{id}/status")
    public ResponseEntity<Void> editarStatus(@PathVariable UUID id, @RequestParam boolean status){
        subtaskRepository.editarStatus(id, status);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id){
        subtaskRepository.remover(id);
        return ResponseEntity.ok().build();
    }

}
