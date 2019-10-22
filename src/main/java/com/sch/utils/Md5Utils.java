package com.sch.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 
 * @宋春浩
 *
 * 2019年10月16日
 */
public class Md5Utils {
	
	/**
	 * 加盐
	 */
	private static String  saltString = "mmcro";
	
	/**
	 * 对密码进行加密
	 * @param pwd
	 * @return
	 */
	public static String md5(String pwd) {
		//对密码进行加密
		return DigestUtils.md5Hex( pwd + saltString);
	}
	
	/**
	 * 
	 * @param pwd
	 * @param salt
	 * @return
	 */
	public static String md5(String pwd,String salt) {
		//对密码进行加密
		return DigestUtils.md5Hex( pwd + salt);
	}
}


