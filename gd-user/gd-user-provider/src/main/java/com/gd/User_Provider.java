package com.gd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan("com.gd.mapper")
@EnableEurekaClient				//将服务注册到eureka
@EnableHystrix	
public class User_Provider {
	public static void main(String[] args) {
		SpringApplication.run(User_Provider.class, args);
	}
}
