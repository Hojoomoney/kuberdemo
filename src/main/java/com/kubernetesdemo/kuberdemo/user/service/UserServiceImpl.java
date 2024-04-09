package com.kubernetesdemo.kuberdemo.user.service;

import com.kubernetesdemo.kuberdemo.common.component.Messenger;
import com.kubernetesdemo.kuberdemo.user.model.User;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;
import com.kubernetesdemo.kuberdemo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Override
    public Messenger save(UserDto t) throws SQLException {
        entityToDto((repository.save(dtoToEntity(t))));
        return new Messenger();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public List<UserDto> findAll() throws SQLException {
        return repository.findAll().stream().map(this::entityToDto).toList();
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return repository.findById(id).map(this::entityToDto);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Messenger modify(UserDto user) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Messenger login(UserDto param) {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }
}
