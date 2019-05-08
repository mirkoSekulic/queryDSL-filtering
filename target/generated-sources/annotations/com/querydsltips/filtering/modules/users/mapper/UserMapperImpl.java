package com.querydsltips.filtering.modules.users.mapper;

import com.querydsltips.filtering.modules.users.domain.User;
import com.querydsltips.filtering.modules.users.dto.UserDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-08T10:10:34+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTOWithoutAuthorities(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setEmail( user.getEmail() );

        return userDTO;
    }
}
