package org.lib.todo.service.impl;

import org.lib.todo.entity.task.Task;
import org.lib.todo.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public Collection<Task> getAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task, long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
