package com.panblog.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.panblog.properties.BasisProperties;

@RestController
public class TestController{

	@Autowired
	private BasisProperties basisProperties;

	@GetMapping(value="/test")
	public String say(){
		return basisProperties.toString();
	}
}