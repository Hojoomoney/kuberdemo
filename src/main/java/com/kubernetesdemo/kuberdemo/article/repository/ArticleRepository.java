package com.kubernetesdemo.kuberdemo.article.repository;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
