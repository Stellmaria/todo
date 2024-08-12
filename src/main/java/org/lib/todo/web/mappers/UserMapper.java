package org.lib.todo.web.mappers;

import org.lib.todo.entity.user.User;
import org.lib.todo.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
