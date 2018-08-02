package com.panblog.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.lang.*;
import java.util.*;

@Document
public class Article{

	@Id
	private String id;

	private String title;

	private String author;

	private String content;

	private List<String> keyWords;

	private String publishTime;

	private String modifyTime;

	private Long clickNum;

	private String category;

	public Article(){}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title ;
	}

	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author ;
	}

	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content = content ;
	}

	public List<String> getKeyWords(){
		return keyWords;
	}
	public void setKeyWords(List<String> keyWords){
		this.keyWords = keyWords ;
	}

	public String getPublishTime(){
		return publishTime;
	}
	public void setPublishTime(String publishTime){
		this.publishTime = publishTime ;
	}

	public String getModifyTime(){
		return modifyTime;
	}
	public void setModifyTime(String modifyTime){
		this.modifyTime = modifyTime ;
	}

	public Long getClickNum(){
		return clickNum;
	}
	public void setClickNum(Long clickNum){
		this.clickNum = clickNum ;
	}

	public String getCategory(){
		return category;
	}
	public void setCategory(String content){
		this.category = category ;
	}

	@Override
	public String toString(){
		return String.format(
			"Article{id=%s,title=%s,author=%s,content_size=%d,publishTime=%s,modifyTime=%s,keyWords=%s,clickNum=%d,category=%s}",
				id,
				title,
				author,
				content.length(),
				publishTime,
				modifyTime,
				keyWords.toString(),
				clickNum,
				category
			);
	}
}