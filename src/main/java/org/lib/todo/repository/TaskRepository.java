package org.lib.todo.repository;

import org.jetbrains.annotations.NotNull;
import org.lib.todo.entity.task.Task;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface TaskRepository {
    @NotNull Optional<Task> findById(@NotNull Long id);

    void deleteById(@NotNull Long id);

    Collection<Task> findAllByUserId(@NotNull Long userId);

    void assignToUserId(Long taskId, Long userId);

    void update(Task task);

    void create(Task task);
}
