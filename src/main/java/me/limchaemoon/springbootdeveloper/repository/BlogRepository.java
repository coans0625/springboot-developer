package me.limchaemoon.springbootdeveloper.repository;

import me.limchaemoon.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
