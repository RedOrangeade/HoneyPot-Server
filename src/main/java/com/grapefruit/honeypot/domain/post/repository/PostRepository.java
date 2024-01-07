package com.grapefruit.honeypot.domain.post.repository;

import com.grapefruit.honeypot.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
