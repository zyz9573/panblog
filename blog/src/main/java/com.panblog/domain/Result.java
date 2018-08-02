package com.panblog.domain;

/***
define a Result templates
including following params
code: status code
msg: error msg
data: object
***/

public class Result<T>{

	private Integer code;

	private String msg;

	private T data;

	public Result(){}

	public Integer getCode(){
		return code;
	}
	public void setCode(Integer code){
		this.code = code;
	}

	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg){
		this.msg = msg;
	}

	public T getData(){
		return data;
	}
	public void setData(T data){
		this.data = data;
	}
}