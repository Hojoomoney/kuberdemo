package com.kubernetesdemo.kuberdemo.common.security.service;

import com.kubernetesdemo.kuberdemo.common.component.Messenger;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;

public interface AuthService {
    Messenger login(UserDto dto);

    String createToken(UserDto user);
}
