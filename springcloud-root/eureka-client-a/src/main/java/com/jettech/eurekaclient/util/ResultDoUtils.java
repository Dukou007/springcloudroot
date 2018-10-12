package com.jettech.eurekaclient.util;

import com.jettech.eurekaclient.vo.ResultVO;

/**
 * 实体封装类
 */
public class ResultDoUtils {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static  ResultVO success(Object obj) {
		  ResultVO result=new ResultVO<>();
		  result.setCode(0);
		  result.setMsg("成功");
		  result.setData(obj);
		  return result;
	}
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static  ResultVO error(Integer code,String msg) {
		  ResultVO result=new ResultVO<>();
		  result.setCode(code);
		  result.setMsg(msg);
		  result.setData(null);
		  return result;
	}
	 
	@SuppressWarnings("rawtypes")
	public static  ResultVO success() {
		
		  return success(null);
	}
}
