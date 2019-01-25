package com.gd.service;

import java.util.List;

import com.gd.pojo.User;


public interface UserService {
	public List<User> find();
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer userId);
	public User findByUserId(Integer userId);
}