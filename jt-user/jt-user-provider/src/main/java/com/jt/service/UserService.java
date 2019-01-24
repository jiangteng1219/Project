package com.jt.service;

import java.util.List;

import com.jt.pojo.User;

public interface UserService {
	public List<User> find();
	public void insert(User user);
	public void update(User user);
	public void delete(List<Integer> ids);
}