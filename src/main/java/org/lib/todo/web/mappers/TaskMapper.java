package org.lib.todo.web.mappers;

import org.lib.todo.entity.task.Task;
import org.lib.todo.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    Task toEntity(TaskDto taskDto);

    Collection<TaskDto> toDto(Collection<Task> tasks);
}
