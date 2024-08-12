package org.lib.todo.entity.task;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class TasksImage {
    @Size(max = 255)
    @NotNull
    private MultipartFile image;
}