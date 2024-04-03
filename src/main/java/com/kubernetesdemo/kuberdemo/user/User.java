package com.kubernetesdemo.kuberdemo.user;

import com.kubernetesdemo.kuberdemo.article.Article;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@Builder
@ToString(exclude = {"id"})
@Entity(name="users")
public class User {
    @Id
    @Column(name="user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String job;

    @OneToMany(mappedBy = "writer")
    private List<Article> articles;
}



