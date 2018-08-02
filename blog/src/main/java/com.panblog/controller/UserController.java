package com.panblog.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.panblog.domain.User;
import com.panblog.domain.Result;
import com.panblog.dao.UserRepository;
import com.panblog.utils.ResultUtil;
import com.panblog.enums.ResultEnum;

import java.lang.*;
import java.util.*;
import javax.validation.Valid;

@RestController
public class UserController{

	@Autowired
	private UserRepository userRepository;

	//get
	@GetMapping(value = "/users")
	public List<User> getUserList(){
		return userRepository.findAll();
	}

	@GetMapping(value = "/users/{id}")
	public User getOneUser(@PathVariable("id") Integer id){
		return userRepository.findById(id).get();
	}

	//add
	@PostMapping(value = "users")
	public Result userAdd(@Valid User user, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return ResultUtil.fail(ResultEnum.DATA_VALIADATION_ERROR,bindingResult.getFieldError().getDefaultMessage());
		}
		user.setName(user.getName());
		user.setPassword(user.getPassword());
		user.setLinkedinlink(user.getLinkedinlink());
		user.setGithublink(user.getGithublink());
		return ResultUtil.success(userRepository.save(user));
	}
	//update
	@PutMapping(value = "/users/{id}")
	public User updateOneUser(@PathVariable("id") Integer id,
								@RequestParam("password") String password){
		User user = userRepository.findById(id).get();
		user.setPassword(password);
		return userRepository.save(user);
	}
	//delete
	@DeleteMapping(value = "/users/{id}")
	public void deleteOneUser(@PathVariable("id") Integer id){
		userRepository.deleteById(id);
	}
}
/***
* https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
* API for Spring.data.core.2.0.9RELEASE
***/