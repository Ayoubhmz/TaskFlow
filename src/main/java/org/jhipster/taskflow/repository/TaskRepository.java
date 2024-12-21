package org.jhipster.taskflow.repository;

import java.util.List;
import java.util.Optional;
import org.jhipster.taskflow.domain.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Task entity.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("select task from Task task where task.assignedTo.login = ?#{authentication.name}")
    List<Task> findByAssignedToIsCurrentUser();

    default Optional<Task> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<Task> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<Task> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select task from Task task left join fetch task.project left join fetch task.assignedTo",
        countQuery = "select count(task) from Task task"
    )
    Page<Task> findAllWithToOneRelationships(Pageable pageable);

    @Query("select task from Task task left join fetch task.project left join fetch task.assignedTo")
    List<Task> findAllWithToOneRelationships();

    @Query("select task from Task task left join fetch task.project left join fetch task.assignedTo where task.id =:id")
    Optional<Task> findOneWithToOneRelationships(@Param("id") Long id);
}