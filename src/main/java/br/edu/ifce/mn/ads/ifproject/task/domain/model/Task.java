package br.edu.ifce.mn.ads.ifproject.task.domain.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.UUID;



@Table("tasks")
public class Task implements Persistable<UUID> {
    @Id
    private UUID id;
    private UUID taskGroupId;
    private UUID creatorId;
    private UUID assigneeId;
    private String title;
    private String description;
    private String priority; // 'LOW', 'MEDIUM', 'HIGH'
    private Integer position;
    private LocalDateTime dueDate;
    private Boolean isArchived;
    private LocalDateTime createdAt;

    @org.springframework.data.annotation.Transient
    private boolean isNew = true;



    public Task() {
        this.isArchived = false;
    }
    public void activate() {
        this.isArchived = false;
    }

    public void update(String title,String description) {
        if (title != null) {
            this.title = title;
        }
        if (description != null) {
            this.description = description;
        }
    }

    public Task(UUID id, UUID taskGroupId, UUID creatorId, UUID assigneeId, String title, String description, String priority, Integer position, LocalDateTime dueDate, LocalDateTime createdAt) {
        this.id = id;
        this.taskGroupId = taskGroupId;
        this.creatorId = creatorId;
        this.assigneeId = assigneeId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.position = position;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }
    @Override
    public UUID getId() { return this.id; }

    @Override
    public boolean isNew() {
        return this.isNew;
    }
    public void markAsNotNew() {
        this.isNew = false;
    }

    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public void archived(){
        this.isArchived = true;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public Integer getPosition() { return position; }
    public void setPosition(Integer position) { this.position = position; }

    public Boolean getIsArchived() { return isArchived; }
    public void setIsArchived(Boolean archived) { isArchived = archived; }

    public UUID getTaskGroupId() { return taskGroupId; }
    public void setTaskGroupId(UUID taskGroupId) { this.taskGroupId = taskGroupId; }

    public UUID getCreatorId() { return creatorId; }
    public void setCreatorId(UUID creatorId) { this.creatorId = creatorId; }

    public UUID getAssigneeId() { return assigneeId; }
    public void setAssigneeId(UUID assigneeId) { this.assigneeId = assigneeId; }

    public LocalDateTime getDueDate() { return dueDate; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }




}



