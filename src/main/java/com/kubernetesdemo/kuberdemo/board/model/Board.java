package com.kubernetesdemo.kuberdemo.board.model;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import com.kubernetesdemo.kuberdemo.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="boards")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Board extends BaseEntity {
    @Id
    @Column(name = "board_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;
    private String boardType;

    @OneToMany(mappedBy ="board", fetch = FetchType.LAZY)
    private List<Article> articles;

}
