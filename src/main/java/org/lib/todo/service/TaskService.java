package org.lib.todo.service;

import org.lib.todo.entity.task.Task;

import java.util.Collection;

public interface TaskService {
    Task getById(Long id);

    Collection<Task> getAllByUserId(Long userId);

    Task update(Task task);

    Task create(Task task, long id);

    void delete(Long id);
}
