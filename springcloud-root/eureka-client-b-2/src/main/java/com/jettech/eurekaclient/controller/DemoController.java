package com.jettech.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 服务控制类
 */
@RestController
@RequestMapping("/get")
public class DemoController {

	@RequestMapping("/info")
	public String get() {
		return "【Client-b】（端口：8764）正在为您提供服务。。。本服务站点为备机！";
	}
	
}
