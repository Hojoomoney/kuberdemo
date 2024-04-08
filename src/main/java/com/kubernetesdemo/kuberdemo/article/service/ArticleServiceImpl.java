package com.kubernetesdemo.kuberdemo.article.service;

import com.kubernetesdemo.kuberdemo.article.model.ArticleDto;
import com.kubernetesdemo.kuberdemo.article.repository.ArticleRepository;
import com.kubernetesdemo.kuberdemo.common.component.Messenger;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;


    @Override
    public Messenger save(ArticleDto t) throws SQLException {
        entityToDto(repository.save(dtoToEntity(t)));
        return new Messenger();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public Messenger modify(ArticleDto articleDto) {
       throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<ArticleDto> findAll() throws SQLException {
        return repository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
        return Optional.empty();
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
    public List<UserDto> findArticlesByTitle(String title) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<UserDto> findArticlesByContent(String content) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }
}
