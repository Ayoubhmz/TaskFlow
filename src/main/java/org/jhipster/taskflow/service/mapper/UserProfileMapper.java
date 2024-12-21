package org.jhipster.taskflow.service.mapper;

import org.jhipster.taskflow.domain.User;
import org.jhipster.taskflow.domain.UserProfile;
import org.jhipster.taskflow.service.dto.UserDTO;
import org.jhipster.taskflow.service.dto.UserProfileDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link UserProfile} and its DTO {@link UserProfileDTO}.
 */
@Mapper(componentModel = "spring")
public interface UserProfileMapper extends EntityMapper<UserProfileDTO, UserProfile> {
    @Mapping(target = "user", source = "user", qualifiedByName = "userLogin")
    UserProfileDTO toDto(UserProfile s);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);
}
