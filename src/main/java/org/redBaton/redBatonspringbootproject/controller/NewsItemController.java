package org.redBaton.redBatonspringbootproject.controller;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.redBaton.redBatonspringbootproject.entity.NewsItem;
import org.redBaton.redBatonspringbootproject.service.NewsItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
public class NewsItemController {

    private final NewsItemService newsItemService;
    @CrossOrigin(origins="http://localhost:4200/")
    @GetMapping("/list")
    public List<NewsItem> showNewsItemList() {
        return newsItemService.getAllNewsItems();
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/create")
    public ResponseEntity<NewsItem> createNewsItem(@RequestBody NewsItem newsItem) {
        NewsItem savedNewsItem = newsItemService.saveNewsItem(newsItem);
        return new ResponseEntity<>(savedNewsItem, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @PutMapping("/update/{id}")
    public ResponseEntity<NewsItem> updateNewsItem(@PathVariable Long id, @RequestBody NewsItem newsItem) {
        newsItem.setId(id);
        NewsItem updatedNewsItem = newsItemService.updateNewsItem(newsItem);
        return new ResponseEntity<>(updatedNewsItem, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNewsItem(@PathVariable Long id) {
        newsItemService.deleteNewsItemById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
