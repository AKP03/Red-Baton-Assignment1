package org.redBaton.redBatonspringbootproject.service.impl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.redBaton.redBatonspringbootproject.entity.NewsItem;
import org.redBaton.redBatonspringbootproject.repository.NewsItemRepository;
import org.redBaton.redBatonspringbootproject.service.NewsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class NewsItemServiceImpl implements NewsItemService{

    private final NewsItemRepository newsItemRepository;

//    @Autowired
//    public NewsItemServiceImpl(NewsItemRepository newsItemRepository) {
//        this.newsItemRepository = newsItemRepository;
//    }

    @Override
    public List<NewsItem> getAllNewsItems() {
        return newsItemRepository.findAll();
    }

    @Override
    public Optional<NewsItem> getNewsItemById(Long id) {
        return newsItemRepository.findById(id);
    }

    @Override
    public NewsItem saveNewsItem(NewsItem newsItem) {
        return newsItemRepository.save(newsItem);
    }

    @Override
    public void deleteNewsItemById(Long id) {
        newsItemRepository.deleteById(id);
    }

    @Override
    public NewsItem updateNewsItem(NewsItem newsItem) {
        // Save the updated news item to the database
        newsItemRepository.save(newsItem);
        return newsItem;
    }
}
