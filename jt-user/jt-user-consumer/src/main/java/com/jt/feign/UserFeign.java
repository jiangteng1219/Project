package com.jt.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.pojo.User;

@FeignClient("jt-user")		//指向访问的提供者
public interface UserFeign {
	@RequestMapping("/user/find")
	public List<User> find();
	
	@RequestMapping("/user/insert/{name}/{birthday}/{address}")
	public String insert(@PathVariable("name") String name, 
			@PathVariable("birthday") String birthday,
			@PathVariable("address") String address);
	
	@RequestMapping("/user/update/{name}/{birthday}/{address}/{id}")
	public String update(@PathVariable("name") String name, 
			@PathVariable("birthday") String birthday,
			@PathVariable("address") String address,
			@PathVariable("id") Integer id);
	
	@RequestMapping("/user/delete/{id}")
	public String delete(@PathVariable("id") Integer id);
}
