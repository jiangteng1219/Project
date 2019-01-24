package com.jt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 1.pom文件中添加jar包
 * 2.编辑yml.xml文件
 * 3.编辑启动项
 * @author Tarena
 *
 */
//表示启动时,不加载数据源的配置
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class SpringCloud_Eureka {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Eureka.class, args);
	}
}
