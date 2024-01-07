package com.grapefruit.honeypot.domain.post.controller;

import com.grapefruit.honeypot.domain.post.dto.WritePost;
import com.grapefruit.honeypot.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/write")
    public void write (@RequestBody WritePost writePost) {
        postService.writePost(writePost);
    }
}
