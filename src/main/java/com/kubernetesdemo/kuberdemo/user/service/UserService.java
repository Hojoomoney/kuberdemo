package com.kubernetesdemo.kuberdemo.user.service;

import com.kubernetesdemo.kuberdemo.common.component.Messenger;
import com.kubernetesdemo.kuberdemo.common.service.CommandService;
import com.kubernetesdemo.kuberdemo.common.service.QueryService;
import com.kubernetesdemo.kuberdemo.user.model.User;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommandService<UserDto>, QueryService<UserDto> {
    // command
    Messenger modify(UserDto user);
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    Optional<User> findUserByUsername(String username);
    Messenger login(UserDto param);
    default User dtoToEntity(UserDto dto){    //dto 를 entity로 바꾸는 것
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .name(dto.getName())
                .phone(dto.getPhone())
                .job(dto.getJob())
                .build();
    }

    default UserDto entityToDto(User ent){ //entity 를 dto로 바꾸는 것
        return UserDto.builder()
                .id(ent.getId())
                .username(ent.getUsername())
                .password(ent.getPassword())
                .email(ent.getEmail())
                .name(ent.getName())
                .phone(ent.getPhone())
                .job(ent.getJob())
                .build();
    }
}
