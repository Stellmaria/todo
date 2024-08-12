package org.lib.todo.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.lib.todo.entity.task.Status;
import org.lib.todo.validation.OnCreate;
import org.lib.todo.validation.OnUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    @NotNull(groups = OnUpdate.class)
    private Long id;

    @NotNull(groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, groups = {OnUpdate.class, OnCreate.class})
    private String title;

    @Length(max = 255, groups = {OnUpdate.class, OnCreate.class})
    private String description;

    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationDate;
}
