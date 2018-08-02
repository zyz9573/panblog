package com.panblog.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.panblog.domain.Article;

public interface ArticleRepository extends MongoRepository<Article, String> {
	/**
	 * define you own query here
	 */
}