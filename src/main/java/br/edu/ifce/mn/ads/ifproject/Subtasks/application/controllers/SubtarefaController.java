package br.edu.ifce.mn.ads.ifproject.Subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.Subtasks.infra.repositories.SubtarefaRepository;
import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaDTOinput;
import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaDTOoutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtarefaController {
    private SubtarefaRepository subtarefaRepository;

    public SubtarefaController(SubtarefaRepository subtarefaRepository) {
        this.subtarefaRepository = subtarefaRepository;
    }

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody SubtarefaDTOinput input){
        subtarefaRepository.criar(input);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/task-groups/{taskId}")
    public ResponseEntity<List<SubtarefaDTOoutput>> listar(@PathVariable UUID taskId){
        List<SubtarefaDTOoutput> lista = subtarefaRepository.listarPorTarefa(taskId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("{id}/texto")
    public ResponseEntity<Void> editarTexto(@PathVariable UUID id, @RequestParam String texto){
        subtarefaRepository.editarTexto(id, texto);
        return ResponseEntity.ok().build();
    }

    @PatchMapping ("{id}/status")
    public ResponseEntity<Void> editarStatus(@PathVariable UUID id, @RequestParam boolean status){
        subtarefaRepository.editarStatus(id, status);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id){
        subtarefaRepository.remover(id);
        return ResponseEntity.ok().build();
    }
}
