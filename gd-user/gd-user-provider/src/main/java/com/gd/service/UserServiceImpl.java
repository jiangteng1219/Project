package com.gd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.mapper.UserMapper;
import com.gd.pojo.User;



@Service
public class UserServiceImpl implements UserService{
	@Autowired	//注入Mapper
	private UserMapper userMapper;
	
	//查询所有
	public List<User> find(){
		return userMapper.selectList(null);
	}
	
	//新增
	public void insertUser(User user){
		userMapper.insert(user);
	}
	
	//修改
	public void updateUser(User user){
		userMapper.updateById(user);
	}
	
	//批量删除
	public void deleteUser(Integer userId){
		userMapper.deleteById(userId);
	}

	@Override
	public User findByUserId(Integer userId) {
		return userMapper.selectById(userId);
	}
}