package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired	//注入Mapper
	private UserMapper userMapper;
	
	//查询所有
	public List<User> find(){
		return userMapper.selectList(null);
	}
	
	//新增
	public void insert(User user){
		userMapper.insert(user);
	}
	
	//修改
	public void update(User user){
		userMapper.updateById(user);
	}
	
	//批量删除
	public void delete(List<Integer> ids){
		userMapper.deleteBatchIds(ids);
	}
}