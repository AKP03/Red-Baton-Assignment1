package org.redBaton.redBatonspringbootproject.repository;
import org.redBaton.redBatonspringbootproject.entity.NewsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NewsItemRepository extends JpaRepository<NewsItem, Long> {
}
