package com.gd.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gd.pojo.User;
import com.gd.factory.UserFallbackFactory;


@FeignClient(value="gd-user-provider",fallbackFactory=UserFallbackFactory.class)		//指向访问的提供者
public interface UserService {
	@RequestMapping("/user/find")
	public List<User> find();
	
	@RequestMapping("/user/insert")
	public String insertUser(@RequestBody User user);

	
	@RequestMapping("/user/update")
	public String updateUser(@RequestBody User user);
	
	@RequestMapping("/user/delete")
	public String deleteUser(@PathVariable("userId") Integer userId);
	
	@RequestMapping("/user/findByUserId")
	public String findByUserId(@RequestParam("userId") Integer userId);
}
