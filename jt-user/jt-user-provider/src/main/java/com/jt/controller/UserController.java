package com.jt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController	//微服务调用，返回对象json串
@RequestMapping("/user")
public class UserController {
	@Autowired	//注入UserService接口
	private UserService userService;
	
	@RequestMapping("/find")
	public List<User> find(){
		return userService.find();
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		try{
			userService.insert(user);
			return "insert success.";
		}catch(Exception e){
			return "insert error.";
		}
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user){
		try{
			userService.update(user);
			return "update success.";
		}catch(Exception e){
			return "update error.";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		try{
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(id);
			
			userService.delete(ids);
			return "delete success.";
		}catch(Exception e){
			return "delete error.";
		}
	}
	
}