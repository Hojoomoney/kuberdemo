package com.kubernetesdemo.kuberdemo.article.model;


import com.kubernetesdemo.kuberdemo.board.model.Board;
import com.kubernetesdemo.kuberdemo.common.BaseEntity;
import com.kubernetesdemo.kuberdemo.user.model.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="articles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Article extends BaseEntity {
   @Id
   @Column(name = "article_id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Setter
   private String title;
   @Setter
   private String content;

   @ManyToOne
   @JoinColumn(name = "board_id")
   private Board board;

   @ManyToOne
   @JoinColumn(name = "writer_id")
   private User writer;

}
