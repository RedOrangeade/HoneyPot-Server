package com.grapefruit.honeypot.domain.post.dto;

import com.grapefruit.honeypot.domain.post.Book;
import com.grapefruit.honeypot.domain.post.Category;
import com.grapefruit.honeypot.domain.post.OTT;
import lombok.Getter;

@Getter
public class WritePost {
    private String title;
    private String content;
    private Category category;
    private OTT ott;
    private Book book;
}
