package com.grapefruit.honeypot.domain.post.entity;

import com.grapefruit.honeypot.domain.post.Book;
import com.grapefruit.honeypot.domain.post.Category;
import com.grapefruit.honeypot.domain.post.OTT;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long PostId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "OTT")
    private OTT ott;

    @Enumerated(EnumType.STRING)
    @Column(name = "book")
    private Book book;

    @ElementCollection
    @Column(name = "likes")
    private List<Long> likes;

    @ElementCollection
    @Column(name = "rating")
    private List<Integer> rating;

    public void setBook(Book book) {
        this.book = book;
    }

    public void setOtt(OTT ott) {
        this.ott = ott;
    }
}
