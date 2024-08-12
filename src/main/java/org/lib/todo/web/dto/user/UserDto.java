package org.lib.todo.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.lib.todo.validation.OnCreate;
import org.lib.todo.validation.OnUpdate;

@Data
public class UserDto {
    @NotNull(groups = OnUpdate.class)
    private Long id;

    @NotNull(groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 100, groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @NotNull(groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 100, groups = {OnUpdate.class, OnCreate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(groups = {OnUpdate.class, OnCreate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(groups = OnCreate.class)
    private String passwordConfirmation;
}
