package org.redBaton.redBatonspringbootproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "news_items")
public class NewsItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String postedOn;

    private int upvotes;

    private int comments;
}

