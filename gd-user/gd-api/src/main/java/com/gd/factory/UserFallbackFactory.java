package com.gd.factory;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.gd.pojo.User;
import com.gd.service.UserService;

import feign.hystrix.FallbackFactory;
//表示对userservice进行熔断
@Component  	//让实现类实例化
public class UserFallbackFactory implements FallbackFactory<UserService>{

	//在客户端编辑熔断方法
	@Override
	public UserService create(Throwable cause) {

		return new UserService() {
			
			@Override
			public String updateUser(User user) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String insertUser(User user) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String findByUserId(Integer userId) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<User> find() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String deleteUser(Integer userId) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
