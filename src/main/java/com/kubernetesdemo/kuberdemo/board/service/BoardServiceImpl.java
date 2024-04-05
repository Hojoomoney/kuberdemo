package com.kubernetesdemo.kuberdemo.board.service;

import com.kubernetesdemo.kuberdemo.board.model.BoardDto;
import com.kubernetesdemo.kuberdemo.board.repository.BoardRepository;
import com.kubernetesdemo.kuberdemo.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repository;


    @Override
    public BoardDto save(BoardDto t) throws SQLException {
        return entityToDto(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<BoardDto> findAll() throws SQLException {
        //return repository.findAll(vo);
        return null;
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
        return Optional.of(entityToDto(repository.findById(id)));
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existById(Long id) {
        return repository.existsById(id);
    }
}