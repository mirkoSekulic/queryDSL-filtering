package com.querydsltips.filtering.modules.users.dto;

import com.querydsltips.filtering.modules.users.domain.Authority;
import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A user dto used for representing user.
 */
@ApiModel(value="User")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class UserDTO implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Min(1)
    private Long id;

    @Size(max = 50)
    @NotEmpty
    private String firstName;

    @Size(max = 50)
    @NotEmpty
    private String lastName;

    @Email
    @Size(min = 5, max = 100)
    @NotEmpty
    private String email;

    private Set<Authority> authorities = new HashSet<>();
}
