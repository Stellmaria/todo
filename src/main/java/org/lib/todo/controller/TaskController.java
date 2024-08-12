package org.lib.todo.controller;

import lombok.RequiredArgsConstructor;
import org.lib.todo.entity.task.Task;
import org.lib.todo.service.TaskService;
import org.lib.todo.validation.OnUpdate;
import org.lib.todo.web.dto.task.TaskDto;
import org.lib.todo.web.mappers.TaskMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {
    private final TaskService taskService;
    private final TaskMapper taskMapper;

    @GetMapping({"/{id}"})
    public TaskDto getTaskById(@PathVariable Long id) {
        Task task = taskService.getById(id);

        return taskMapper.toDto(task);
    }

    @DeleteMapping({"/{id}"})
    public void deleteTaskById(@PathVariable Long id) {
        taskService.delete(id);
    }

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) @RequestBody TaskDto dtp) {
        Task task = taskMapper.toEntity(dtp);
        Task updated = taskService.update(task);

        return taskMapper.toDto(updated);
    }
}
