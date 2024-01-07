package com.grapefruit.honeypot.domain.post.service;

import com.grapefruit.honeypot.domain.post.Category;
import com.grapefruit.honeypot.domain.post.dto.WritePost;
import com.grapefruit.honeypot.domain.post.entity.Post;
import com.grapefruit.honeypot.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public void writePost (WritePost writePost) {
        Post post = Post.builder()
                .title(writePost.getTitle())
                .content(writePost.getContent())
                .category(writePost.getCategory())
                .build();

        if (writePost.getCategory().equals(Category.OTT)) {
            post.setOtt(writePost.getOtt());
        } else if (writePost.getCategory().equals(Category.BOOK)) {
            post.setBook(writePost.getBook());
        }

        postRepository.save(post);
    }
}
