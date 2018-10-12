package com.jettech.eureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务控制类
 */
@Controller
@RequestMapping("/get")
public class LoginController {

	@RequestMapping("/info")
	@ResponseBody
	public String get() {
		return "服务注册中心正在工作。。。";
	}
}
