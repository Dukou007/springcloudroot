package com.jettech.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class EurekclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekclientApplication.class, args);
	}
}
