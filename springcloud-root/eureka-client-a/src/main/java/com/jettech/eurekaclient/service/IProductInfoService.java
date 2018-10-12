package com.jettech.eurekaclient.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jettech.eurekaclient.vo.ProductInfo;



/**
 * 业务服务接口
 */
public interface IProductInfoService {
	
  public ProductInfo findOne(String id);
  Page<ProductInfo> findAll(Pageable pageable);
  public List<ProductInfo> findAll();
  public ProductInfo saveProductInfo(ProductInfo productInfo);
  
}
