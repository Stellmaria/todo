package org.lib.todo.repository.impl;

import org.jetbrains.annotations.NotNull;
import org.lib.todo.entity.user.Role;
import org.lib.todo.entity.user.User;
import org.lib.todo.repository.UserRepository;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public @NotNull Optional<User> findById(@NotNull Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(@NotNull Long id) {

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }
}
