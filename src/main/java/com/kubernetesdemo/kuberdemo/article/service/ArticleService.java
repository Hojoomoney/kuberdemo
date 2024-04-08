package com.kubernetesdemo.kuberdemo.article.service;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import com.kubernetesdemo.kuberdemo.article.model.ArticleDto;
import com.kubernetesdemo.kuberdemo.common.service.CommandService;
import com.kubernetesdemo.kuberdemo.common.service.QueryService;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {
    // 디폴트 메소드는 로직도 똑같을 때 선언

    List<UserDto> findArticlesByTitle(String title);
    List<UserDto> findArticlesByContent(String content);
    default Article dtoToEntity(ArticleDto dto){    //dto 를 entity로 바꾸는 것
        return Article.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }

    default ArticleDto entityToDto(Article ent){ //entity 를 dto로 바꾸는 것
        return ArticleDto.builder()
                .id(ent.getId())
                .title(ent.getTitle())
                .content(ent.getContent())
                .build();
    }
}
