package de.seuhd.campuscoffee.api.mapper;

import de.seuhd.campuscoffee.api.dtos.UserDto;
import de.seuhd.campuscoffee.domain.model.User;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * MapStruct mapper for converting between user domain model and DTOs.
 */
@Mapper(componentModel = "spring")
@ConditionalOnMissingBean
public interface UserDtoMapper {
    //TODO: Implement user DTO mapper
    UserDto fromDomain(User source);
    User toDomain(UserDto source);
}