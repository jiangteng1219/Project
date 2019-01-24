package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.feign.UserFeign;
import com.jt.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	//注入Feign接口
	@Autowired
	private UserFeign userFeign;
	
	@RequestMapping("/find")
	public List<User> find(){
		return userFeign.find();
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		
		return userFeign.insert(user.getName(), user.getBirthday(), user.getAddress());
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user){
		return userFeign.update(user.getName(),user.getBirthday(),user.getAddress(),user.getId());
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id){
		return userFeign.delete(id);
	}
}
