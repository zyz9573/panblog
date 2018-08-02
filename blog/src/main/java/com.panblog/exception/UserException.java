package com.panblog.exception;

import com.panblog.enums.*;
/**
 * self define exception
 * RuntimEexception will call back
 */
public class UserException extends RuntimeException{
	private Integer code;

	public UserException(ResultEnum resultEnum){
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode(){
		return code;
	}
	public void setCode(Integer code){
		this.code = code;
	}
}