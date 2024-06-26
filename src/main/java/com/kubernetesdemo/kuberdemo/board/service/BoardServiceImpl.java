package com.kubernetesdemo.kuberdemo.board.service;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import com.kubernetesdemo.kuberdemo.board.model.Board;
import com.kubernetesdemo.kuberdemo.board.model.BoardDto;
import com.kubernetesdemo.kuberdemo.board.repository.BoardRepository;
import com.kubernetesdemo.kuberdemo.common.component.Messenger;
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
    public Messenger save(BoardDto t) throws SQLException {
        repository.save(dtoToEntity(t));
        return Messenger.builder()
                .message(repository.existsById(t.getId()) ? "SUCCESS" : "FAILURE")
                .build();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return Messenger.builder()
                .message(repository.existsById(id) ? "FAILURE" : "SUCCESS")
                .build();
    }

    @Override
    public Messenger modify(BoardDto boardDto) {
        Board board = repository.findById(boardDto.getId()).orElseThrow(null);
        board.setBoardName(boardDto.getBoardName());
        board.setBoardType(boardDto.getBoardType());
        repository.save(board);
        return Messenger.builder()
                .message(repository.existsById(board.getId()) ? "SUCCESS" : "FAILURE")
                .build();
    }

    @Override
    public List<BoardDto> findAll() throws SQLException {
        return repository.findAll().stream().map(this::entityToDto).toList();
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
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
}
