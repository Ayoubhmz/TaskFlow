package org.jhipster.taskflow.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.jhipster.taskflow.domain.enumeration.TaskPriority;
import org.jhipster.taskflow.domain.enumeration.TaskStatus;

/**
 * A Task.
 */
@Entity
@Table(name = "task")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(min = 3)
    @Column(name = "title", nullable = false)
    private String title;

    @Size(max = 1000)
    @Column(name = "description", length = 1000)
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TaskStatus status;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false)
    private TaskPriority priority;

    @Column(name = "deadline")
    private Instant deadline;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "users" }, allowSetters = true)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    private User assignedTo;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Task id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public Task title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public Task description(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return this.status;
    }

    public Task status(TaskStatus status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    public Task priority(TaskPriority priority) {
        this.setPriority(priority);
        return this;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Instant getDeadline() {
        return this.deadline;
    }

    public Task deadline(Instant deadline) {
        this.setDeadline(deadline);
        return this;
    }

    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }

    public Instant getCreatedDate() {
        return this.createdDate;
    }

    public Task createdDate(Instant createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task project(Project project) {
        this.setProject(project);
        return this;
    }

    public User getAssignedTo() {
        return this.assignedTo;
    }

    public void setAssignedTo(User user) {
        this.assignedTo = user;
    }

    public Task assignedTo(User user) {
        this.setAssignedTo(user);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        return getId() != null && getId().equals(((Task) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Task{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", status='" + getStatus() + "'" +
            ", priority='" + getPriority() + "'" +
            ", deadline='" + getDeadline() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            "}";
    }
}
