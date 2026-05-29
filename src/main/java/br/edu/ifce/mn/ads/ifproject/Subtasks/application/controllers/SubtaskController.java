package br.edu.ifce.mn.ads.ifproject.Subtasks.application.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifce.mn.ads.ifproject.Subtasks.model.SubtarefaModel;

@RestController
@RequestMapping("api/v1/subtasks")
public class SubtaskController {
    private final SubtarefaModel subtarefaModel;

    SubtaskController(SubtarefaModel subtarefaModel) {
        this.subtarefaModel = subtarefaModel;
    }


}
