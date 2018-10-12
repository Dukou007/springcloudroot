package com.jettech.eurekaclient.vo;

import lombok.Data;

/**
 * 返回给http请求的对象
 */
@Data
public class ResultVO<T> {
   private Integer code;
   private String msg;
   private T data;

}
