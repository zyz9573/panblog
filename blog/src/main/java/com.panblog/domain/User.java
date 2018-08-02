package com.panblog.domain;
/***
object entity
***/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.*;

@Entity//this class represen to a table in database
public class User{
	@Id
	@GeneratedValue
	private Integer id;

	@NotNull(message="username can't be null")
	private String name;

	private String linkedinlink;

	private String githublink;

	@NotNull(message="password can not be null")
	@Size(min = 8, max = 16, message="length of password must in [8,16]")
	private String password;

	public User(){}

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name ;
	}

	public String getLinkedinlink(){
		return linkedinlink;
	}
	public void setLinkedinlink(String linkedinlink){
		this.linkedinlink = linkedinlink ;
	}

	public String getGithublink(){
		return githublink;
	}
	public void setGithublink(String githublink){
		this.githublink = githublink ;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password ;
	}

	public String toString(){
		return "User{" + 
				"id="+id+
				", name="+name+
				", password="+password+
				", ll="+linkedinlink+
				", gl="+githublink+
				"}";
	}
}