package com.kubernetesdemo.kuberdemo.article;


import com.kubernetesdemo.kuberdemo.board.Board;
import com.kubernetesdemo.kuberdemo.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="articles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Article {
   @Id
   @Column(name = "article_id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String content;
   private String registerDate;

   @ManyToOne
   @JoinColumn(name = "board_id")
   private Board board;

   @ManyToOne
   @JoinColumn(name = "writer_id")
   private User writer;

}
