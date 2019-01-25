package com.gd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gd.pojo.User;
import com.gd.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	// 注入Feign接口
	@Autowired
	private UserService userService;

	@RequestMapping("/find")
	public List<User> find() {
		return userService.find();
	}

	@RequestMapping("/insert/{username}/{password}/{nikename}")
	public String insertUser(User user) {

		return userService.insertUser(user);
	}


	@RequestMapping("/update/{username}/{password}/{nikename}/{userId}") 
	public  String updateUser(User user){ 
		return userService.updateUser(user); 
	}

	@RequestMapping("/delete/{userId}") 
	public String deleteUser(@PathVariable("userId") Integer userId){ 
		return userService.deleteUser(userId); 
	}

	//个人中心查询用户信息

	@RequestMapping("/findByUserId/{userId}") 
	public String findByUserId(@RequestParam("userId") Integer userId) { 
		return	userService.findByUserId(userId); 
	}

}
