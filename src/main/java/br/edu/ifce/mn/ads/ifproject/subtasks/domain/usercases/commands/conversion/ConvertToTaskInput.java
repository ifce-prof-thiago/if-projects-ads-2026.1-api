package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import java.time.OffsetDateTime;
import java.util.UUID;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.enums.Priority;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ConvertToTaskInput {

    @NotNull(message = "Campo não pode ser nulo")
    private final UUID subtaskId;

    private UUID task_group_id;

    private UUID creator_id;

    private UUID assignee_id;

    @NotBlank(message = "Campo título não pode estar vazio")
    private final String title;

    @NotNull(message = "Campo descirção não pode estar vazio")
    private final String newDescription;

    @NotNull(message = "Campo priority não pode estar vazio")
    private final Priority priority;

    @Min(value = 0, message = "Valor do id deve ser maior que 0")
    private int position;

    @FutureOrPresent
    private final OffsetDateTime dueDate;

    private Boolean is_archived;

    private OffsetDateTime created_at;

    public ConvertToTaskInput(UUID subtaskId, String title, String newDescription, Priority priority, String dueDate){

        this.subtaskId = subtaskId;
        this.title = title;
        this.newDescription = newDescription;
        this.priority = priority;
        this.dueDate = OffsetDateTime.parse(dueDate);
    }

    public UUID getSubtaskId() {
        return subtaskId;
    }

    public UUID getTask_group_id() {
        return task_group_id;
    }

    public UUID getCreator_id() {
        return creator_id;
    }

    public UUID getAssignee_id() {
        return assignee_id;
    }

    public String getTitle() {
        return title;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public String getPriority() {
        return priority.name();
    }

    public int getPosition() {
        return position;
    }

    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public Boolean getIs_archived() {
        return is_archived;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public void setTask_group_id(UUID task_group_id) {
        this.task_group_id = task_group_id;
    }

    public void setCreator_id(UUID creator_id) {
        this.creator_id = creator_id;
    }

    public void setAssignee_id(UUID assignee_id) {
        this.assignee_id = assignee_id;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public void setCreated_at(OffsetDateTime created_at){
        this.created_at = created_at;
    }

    public void setIs_archived(Boolean is_archived){
        this.is_archived = is_archived;
    }
}
