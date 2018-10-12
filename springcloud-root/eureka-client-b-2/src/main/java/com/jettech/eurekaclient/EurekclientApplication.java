package com.jettech.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekclientApplication.class, args);
	}
}
