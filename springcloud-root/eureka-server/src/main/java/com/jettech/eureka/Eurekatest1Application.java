package com.jettech.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务启动类
 */
@EnableEurekaServer 
@SpringBootApplication
public class Eurekatest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekatest1Application.class, args);
	}
}
