package com.kubernetesdemo.kuberdemo.user.model;

import com.kubernetesdemo.kuberdemo.article.model.Article;
import com.kubernetesdemo.kuberdemo.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@Builder
@ToString(exclude = {"id"})
@Entity(name="users")
public class User extends BaseEntity {
    @Id
    @Column(name="user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Setter
    private String password;
    private String email;
    private String name;
    @Setter
    private String phone;
    @Setter
    private String job;

    @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles;
}



