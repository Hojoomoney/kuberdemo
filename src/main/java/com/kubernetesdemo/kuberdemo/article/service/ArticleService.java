package com.kubernetesdemo.kuberdemo.article.service;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import com.kubernetesdemo.kuberdemo.article.model.ArticleDto;
import com.kubernetesdemo.kuberdemo.common.service.CommandService;
import com.kubernetesdemo.kuberdemo.common.service.QueryService;

import java.util.Optional;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {
    // 디폴트 메소드는 로직도 똑같을 때 선언
    default Article dtoToEntity(ArticleDto dto){    //dto 를 entity로 바꾸는 것
        return Article.builder().build();
    }

    default ArticleDto entityToDto(Optional<Article> ent){ //entity 를 dto로 바꾸는 것
        return ArticleDto.builder().build();
    }
}
