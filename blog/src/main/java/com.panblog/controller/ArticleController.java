package com.panblog.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.panblog.domain.Article;
import com.panblog.domain.Result;
import com.panblog.dao.ArticleRepository;
import com.panblog.utils.ResultUtil;

import java.lang.*;
import java.util.*;
import javax.validation.Valid;

@RestController
public class ArticleController{

	@Autowired
	private ArticleRepository articleRepository;

	//add article
	@PostMapping(value = "/articles")
	public Result articleAdd(@Valid Article article, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			//validate input
			return ResultUtil.fail(1,bindingResult.getFieldError().getDefaultMessage());
		}
		article.setId(article.getId());
		article.setTitle(article.getTitle());
		article.setAuthor(article.getAuthor());
		article.setContent(article.getContent());
		return ResultUtil.success(articleRepository.insert(article));
	}

	//query all articles
	@GetMapping(value = "/articles")
	public List<Article> getAllArticle(){
		return articleRepository.findAll();
	}

	//query one article
	@GetMapping(value = "/articles/{id}")
	public Article getOneArticle(@PathVariable("id") String id){
		return articleRepository.findById(id).get();
	}

	//update an article
	@PutMapping(value = "/articles/{id}")
	public Result updateOneUser(@PathVariable("id") String id,
								@RequestParam("content") String content){
		Article article = articleRepository.findById(id).get();
		article.setContent(content);
		articleRepository.deleteById(id);
		return ResultUtil.success(articleRepository.insert(article));
	}	

	//delete an article
	@DeleteMapping(value = "/articles/{id}")
	public Result deleteOneUser(@PathVariable("id") String id){
		articleRepository.deleteById(id);
		return ResultUtil.success("delete");
	}
}