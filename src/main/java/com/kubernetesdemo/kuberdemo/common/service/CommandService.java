package com.kubernetesdemo.kuberdemo.common.service;

import com.kubernetesdemo.kuberdemo.common.component.MessengerVo;

import java.sql.SQLException;

public interface CommandService<T> {
    T save(T t) throws SQLException;
    void deleteById(Long id);
}
