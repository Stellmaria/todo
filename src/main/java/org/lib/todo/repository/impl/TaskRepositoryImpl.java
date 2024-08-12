package org.lib.todo.repository.impl;

import org.jetbrains.annotations.NotNull;
import org.lib.todo.entity.task.Task;
import org.lib.todo.repository.TaskRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public @NotNull Optional<Task> findById(@NotNull Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(@NotNull Long id) {

    }

    @Override
    public Collection<Task> findAllByUserId(@NotNull Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserId(Long taskId, Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }
}
