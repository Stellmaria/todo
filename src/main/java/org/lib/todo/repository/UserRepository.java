package org.lib.todo.repository;

import org.jetbrains.annotations.NotNull;
import org.lib.todo.entity.user.Role;
import org.lib.todo.entity.user.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    @NotNull Optional<User> findById(@NotNull Long id);

    void deleteById(@NotNull Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId, Long taskId);
}
