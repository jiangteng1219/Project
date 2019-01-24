package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.jt.mapper")
@EnableEurekaClient				//将服务注册到eureka
public class RunAppProviderUser {
	public static void main(String[] args) {
		SpringApplication.run(RunAppProviderUser.class, args);
	}
}
