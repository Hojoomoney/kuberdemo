package com.kubernetesdemo.kuberdemo.common.service;

import com.kubernetesdemo.kuberdemo.common.component.PageRequestVo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface QueryService<T> {
    List<T> findAll() throws SQLException;
    Optional<T> findById(Long id);
    long count();
    boolean existById(Long id);

}
