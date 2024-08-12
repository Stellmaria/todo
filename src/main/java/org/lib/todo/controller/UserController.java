package org.lib.todo.controller;

import lombok.RequiredArgsConstructor;
import org.lib.todo.entity.task.Task;
import org.lib.todo.entity.user.User;
import org.lib.todo.service.TaskService;
import org.lib.todo.service.UserService;
import org.lib.todo.validation.OnCreate;
import org.lib.todo.validation.OnUpdate;
import org.lib.todo.web.dto.task.TaskDto;
import org.lib.todo.web.dto.user.UserDto;
import org.lib.todo.web.mappers.TaskMapper;
import org.lib.todo.web.mappers.UserMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updated = userService.update(user);

        return userMapper.toDto(updated);
    }

    @GetMapping({"/{id}"})
    public UserDto getUserById(@PathVariable Long id) {
        User user = userService.getById(id);

        return userMapper.toDto(user);
    }

    @DeleteMapping({"/{id}"})
    public void deleteUserById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping({"/{id}/tasks"})
    public Collection<TaskDto> getTasksById(@PathVariable Long id) {
        Collection<Task> tasks = taskService.getAllByUserId(id);

        return taskMapper.toDto(tasks);
    }

    @PostMapping({"/{id}/tasks"})
    public TaskDto createTask(@PathVariable Long id, @Validated(OnCreate.class) @RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task created = taskService.create(task, id);

        return taskMapper.toDto(created);
    }
}
