package com.wangzhenlin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wangzhenlin.StringUtils;

public class TestStringUtils {

	@Test
	public void testIsBlank() {
		// 断言  真
		assertTrue( StringUtils.isBlank("   "));
		
	}
	
	@Test
	public void testIsBlank2() {
		//断言 假
		assertFalse( StringUtils.isBlank("aaaa"));
	}
	
	@Test
	public void testRandomn() {
		String s = StringUtils.getRandomStr(10);
		System.out.println(" s is :: " + s);
	}
	
	@Test
	public void testStrRland() {
		String s = StringUtils.getRandomStr2(25);
		System.out.println(" s is " + s + "  and 长度是  " + s.length());
	}
	
	
	@Test
	public void testCnStrn() {
		String s = StringUtils.getRandomCn(25);
		System.out.println(" s " + s + "  changdu : " + s.length());
		
	}
	
}
