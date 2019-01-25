package com.gd.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

//利用MybatisPlus的注解
@Data
@Accessors(chain=true)
@TableName(value="gd_user")	//类和数据库表的映射
public class User {
	@TableId(type=IdType.AUTO)		//主键，自增
	private Integer userId;
	private String username;
	private String password;
	private String nikename;
	private String description;
	
	//对日期类型进行格式转换
	private String birthday;
	private String createtime;
	private String updatetime;
	private Integer valid;
	private String phone;
	private String email;

	
	
}