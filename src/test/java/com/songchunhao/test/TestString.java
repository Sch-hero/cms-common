package com.songchunhao.test;

import org.junit.Test;

import com.sch.utils.StringUtils;


public class TestString {
	
	@Test
	public void testRandom() {
		
		String s = StringUtils.randomCharAndNumber(20);
		System.out.println("s is " + s);
		
	}
	
	@Test
	public void testHtml() {
		String src =" 张三\r\n李四\r 王五";
		String html = StringUtils.toHtml(src);
		System.out.println("html is " + html);
		
	}

}
