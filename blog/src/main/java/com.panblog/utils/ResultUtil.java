package com.panblog.utils;
/**
 * tool class to do some stuff avoid repeat
 * 
 */
import com.panblog.domain.Result;
import com.panblog.enums.ResultEnum;

public class ResultUtil{
	public static Result success(Object object){
		Result result = new Result();
		result.setCode(0);
		result.setMsg(" success");
		result.setData(object);
		return result;
	}

	public static Result success(String msg){
		Result result = new Result();
		result.setCode(0);
		result.setMsg(msg + "success");
		result.setData(null);
		return result;
	}

	public static Result success(){
		return success(null);
	}

	public static Result fail(Integer code, String msg){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}

	public static Result fail(ResultEnum resultEnum){
		Result result = new Result();
		result.setCode(resultEnum.getCode());
		result.setMsg(resultEnum.getMsg());
		return result;
	}

	public static Result fail(ResultEnum resultEnum,String detail){
		Result result = new Result();
		result.setCode(resultEnum.getCode());
		result.setMsg(resultEnum.getMsg()+" : "+detail);
		return result;
	}
}