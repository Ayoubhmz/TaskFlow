package org.jhipster.taskflow.service.mapper;

import org.jhipster.taskflow.domain.Project;
import org.jhipster.taskflow.domain.Task;
import org.jhipster.taskflow.domain.User;
import org.jhipster.taskflow.service.dto.ProjectDTO;
import org.jhipster.taskflow.service.dto.TaskDTO;
import org.jhipster.taskflow.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {
    @Mapping(target = "project", source = "project", qualifiedByName = "projectName")
    @Mapping(target = "assignedTo", source = "assignedTo", qualifiedByName = "userLogin")
    TaskDTO toDto(Task s);

    @Named("projectName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ProjectDTO toDtoProjectName(Project project);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);
}
