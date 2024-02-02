package org.redBaton.redBatonspringbootproject.service;
import org.redBaton.redBatonspringbootproject.entity.NewsItem;

import java.util.List;
import java.util.Optional;
public interface NewsItemService {

    List<NewsItem> getAllNewsItems();
    Optional<NewsItem> getNewsItemById(Long id);
    NewsItem saveNewsItem(NewsItem newsItem);
    void deleteNewsItemById(Long id);

    NewsItem updateNewsItem(NewsItem newsItem);
}
