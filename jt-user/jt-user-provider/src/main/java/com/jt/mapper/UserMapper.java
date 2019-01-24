package com.jt.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.jt.pojo.User;

//使用MP后，继承BaseMapper接口，实现单表CRUD SQL语句
public interface UserMapper extends BaseMapper<User>{

}