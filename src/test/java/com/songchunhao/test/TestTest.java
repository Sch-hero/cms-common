package com.songchunhao.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sch.utils.StringUtils;

public class TestTest {
	
	@BeforeClass
	public static void testBeforClass() {
		System.out.println("testBeforClass");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("testAfterClass");
	}
	
	@Before
	public void testBefor() {
		System.out.println("testBefor");
	}
	
	@After
	public void testAfter() {
		System.out.println("testAfter");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
		int m=21;
		//assertEquals(20, m);
		System.out.println("继续执行");
	}
	
	//@Test
	public void testSuffix() {
		String fileName = "d:\\tst\\my.xls";
		String suffix = StringUtils.getFileSuffix(fileName);
		assertEquals(suffix, ".xls");// 断言是否 相同
		//assertNotEquals(unexpected, actual); 不相同
		assertThat(1, is(2));//
		//assert
		
	}
	
	@Test
	public void testSuffix2() {
		String fileName = "d:\\tst\\my.xls";
		String suffix = StringUtils.getFileSuffix(fileName);
		assertFalse(".xls".equals(suffix));// 断言是否 相同
		System.out.println("testSuffix2  ===== ");
		
	}
	
	//@Test
	public void testArray() {
		char c[]=new char[3];
		System.out.println("c 3 is " + c[3]);
	}
	
	
	
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	
	
	
	

}
