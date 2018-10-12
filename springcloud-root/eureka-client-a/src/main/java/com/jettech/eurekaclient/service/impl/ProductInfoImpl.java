package com.jettech.eurekaclient.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jettech.eurekaclient.reposity.ProductInfoReposity;
import com.jettech.eurekaclient.service.IProductInfoService;
import com.jettech.eurekaclient.vo.ProductInfo;

/**
 * 业务实现类
 */
@Service
public class ProductInfoImpl implements IProductInfoService {
	
    @Autowired
    ProductInfoReposity reposity;
    
	/*
	 * 根据id查询数据商品
	 */
	public ProductInfo findOne(String id) {
		
		//return reposity.findOne(id);
		return null;
	}

	/*
	 * 查询所有商品
	 * @see com.imooc.eurekaclient.service.IProductInfoService#findAll()
	 */
	public List<ProductInfo> findAll() {
		
		return reposity.findAll();
	}

	/*
	 * 保存/更新
	 * @see com.imooc.eurekaclient.service.IProductInfoService#saveProductInfo(com.imooc.eurekaclient.vo.ProductInfo)
	 */
	public ProductInfo saveProductInfo(ProductInfo productInfo) {
		
		return reposity.save(productInfo);
	}

	/*
	 * 分页查询
	 * @see com.imooc.eurekaclient.service.IProductInfoService#findAll(org.springframework.data.domain.Pageable)
	 */
	public Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable) {
		
		return reposity.findAll(pageable);
	}

}
