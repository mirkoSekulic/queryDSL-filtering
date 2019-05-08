package com.querydsltips.filtering.modules.users.mapper;

import com.querydsltips.filtering.modules.users.domain.User;
import com.querydsltips.filtering.modules.users.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    @Mapping(target = "authorities", ignore = true)
    UserDTO userToUserDTOWithoutAuthorities(User user);
}
