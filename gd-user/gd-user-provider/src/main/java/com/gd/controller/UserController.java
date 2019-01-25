package com.gd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gd.pojo.User;
import com.gd.service.UserService;



@RestController	//微服务调用，返回对象json串
@RequestMapping("/user")
public class UserController {
	@Autowired	//注入UserService接口
	private UserService userService;

	@RequestMapping("/find")
	public List<User> find(){
		return userService.find();
	}


	@RequestMapping("/insert") 
	public String insertUser(@RequestBody User user){ 
		try{ userService.insertUser(user); 
		return "insert success.";
		}catch(Exception e){ 
			return "insert error."; 
		} 
	}



	@RequestMapping("/update")
	public String updateUser(@RequestBody User user){
		try{
			userService.updateUser(user);
			return "updateUser success.";
		}catch(Exception e){
			return "updateUser error.";
		}
	}

	@RequestMapping("/delete")
	public String deleteUser(@PathVariable("userId") Integer userId){
		try{
			userService.deleteUser(userId);
			return "delete success.";
		}catch(Exception e){
			return "delete error.";
		}
	}

	@RequestMapping("/findByUserId")
	public User findByUserId(@RequestParam("userId") Integer userId) {

		return userService.findByUserId(userId);
	}
}