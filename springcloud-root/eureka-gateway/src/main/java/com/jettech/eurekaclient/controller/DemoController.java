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
	public String getInfo() {
		return "【API-GATEWAY】（端口：8766）正在为您提供服务。。。";
	}

}