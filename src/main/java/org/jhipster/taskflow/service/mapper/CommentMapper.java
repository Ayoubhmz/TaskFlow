package org.jhipster.taskflow.service.mapper;

import org.jhipster.taskflow.domain.Comment;
import org.jhipster.taskflow.domain.Task;
import org.jhipster.taskflow.service.dto.CommentDTO;
import org.jhipster.taskflow.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comment} and its DTO {@link CommentDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
    @Mapping(target = "task", source = "task", qualifiedByName = "taskTitle")
    CommentDTO toDto(Comment s);

    @Named("taskTitle")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    TaskDTO toDtoTaskTitle(Task task);
}
