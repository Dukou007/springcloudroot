package com.jettech.eurekaclient.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jettech.eurekaclient.vo.ProductInfo;

/**
 * JPA接口方法定义
 */
public interface ProductInfoReposity extends JpaRepository<ProductInfo, String> {
  List<ProductInfo> findByProductStatus(Integer prouctStatus);
}
