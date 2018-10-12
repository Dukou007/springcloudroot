package com.jettech.eurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jettech.eurekaclient.service.impl.ProductInfoImpl;
import com.jettech.eurekaclient.util.ResultDoUtils;
import com.jettech.eurekaclient.vo.ProductInfo;
import com.jettech.eurekaclient.vo.ResultVO;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务控制类
 */
@Slf4j
@RestController
@RequestMapping("/service")
public class DemoController {

	@Autowired
	ProductInfoImpl productInfoImpl;
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/get")
	public String get() {
		return "【Client-a】（端口：8762）正在为您提供服务。。。";
	}

	@GetMapping(value = "/list", produces = { "application/json;charset=UTF-8" })
	public ResultVO list() {

		// 查询所有的类目
		List<ProductInfo> productInfo = productInfoImpl.findAll();
		ResultDoUtils.success(productInfo);

		return ResultDoUtils.success(productInfo);
	}

	@GetMapping(value = "/listxml")
	public ResultVO xmlList() {

		// 查询所有的类目
		List<ProductInfo> productInfo = productInfoImpl.findAll();
		ResultDoUtils.success(productInfo);

		return ResultDoUtils.success(productInfo);
	}

	/*
	 * 通过restTemplate调用外部Rest服务
	 */
	@RequestMapping("/getOtherServices")
	public String getOtherService() {
		String response = restTemplate.getForObject("http://client-b/get/info", String.class);
		log.info("response{}", response);
		return response;
	}
}
