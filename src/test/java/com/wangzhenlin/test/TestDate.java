package com.wangzhenlin.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.wangzhenlin.DateUtils;

public class TestDate {

	@Test
	public void testAge() {
		
		Date date = new Date();
		assertTrue(0==DateUtils.calculateAge(date));
		
		
		Date date2 = new Date(-12,11,9);
		int age = DateUtils.calculateAge(date2);
		System.out.println(" age shi " + age);	
	}
	
	@Test
	public void testBom() {
		Date  bom = DateUtils.getBOM(new Date());
		System.out.println("bom is " + bom);
	}
	
	@Test
	public void testEom(){
		Date  eom = DateUtils.getEOM(new Date());
		System.out.println("eom is " + eom);
	}
	
}
