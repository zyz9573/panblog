package com.panblog.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.lang.*;

@Component
@ConfigurationProperties(prefix = "basis")
public class BasisProperties{
	private String name;
	private String birth;
	private String sex;

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getBirth(){
		return birth;
	}
	public void setBirth(String birth){
		this.birth = birth;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex ;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("A ");
		sb.append(sex);
		sb.append(" came to this world from ");
		sb.append(birth);
		sb.append(" is here, named ");
		sb.append(name);
		return sb.toString();
	}	
}