package org.jhipster.taskflow.service.mapper;

import java.util.Set;
import java.util.stream.Collectors;
import org.jhipster.taskflow.domain.Project;
import org.jhipster.taskflow.domain.User;
import org.jhipster.taskflow.service.dto.ProjectDTO;
import org.jhipster.taskflow.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Project} and its DTO {@link ProjectDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProjectMapper extends EntityMapper<ProjectDTO, Project> {
    @Mapping(target = "users", source = "users", qualifiedByName = "userLoginSet")
    ProjectDTO toDto(Project s);

    @Mapping(target = "removeUser", ignore = true)
    Project toEntity(ProjectDTO projectDTO);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);

    @Named("userLoginSet")
    default Set<UserDTO> toDtoUserLoginSet(Set<User> user) {
        return user.stream().map(this::toDtoUserLogin).collect(Collectors.toSet());
    }
}
