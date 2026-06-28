package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.conversion.SearchIdOutput;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOinput;


import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import br.edu.ifce.mn.ads.ifproject.subtasks.model.SubtarefaDTOoutput;

public interface ISubtaskRepository {

    SubtaskToggleResult toggle(UUID id);

    UUID persistNewTask(ConvertToTaskInput input);

    Optional<SearchIdOutput> findParentTaskInfo(UUID id);

    void removeSubtask(UUID id);

    int lastPositionTask();

    boolean isCompletedSubtask(UUID id);

    void updatePositionSubtasksAfterConversion(int position, UUID taskID);

    int getPositionConvertedSubtask(UUID id);

    void criar(SubtarefaDTOinput dto);

    List<SubtarefaDTOoutput> listarPorTarefa(UUID taskId);

    void editarTexto(UUID id, String novoTexto);

    void editarStatus(UUID id, Boolean novoStatus);

    void editarPosicao(UUID id, Integer novaPosicao);

    void remover(UUID id);

    record SubtaskToggleResult(UUID id, boolean isCompleted) {}

    record ConvertToTaskInput(
            UUID task_group_id,
            UUID creator_id,
            UUID assignee_id,
            String title,
            int position,
            boolean is_archived,
            OffsetDateTime created_at
    ) {
    }
}