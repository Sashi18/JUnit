package com.stackroute.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	App ob = new App();
	
	@Test
	public void test() {
		assertEquals(54321, ob.sorting(23154));
		//assertEquals(12345, ob.sorting(23154));
	}
	
	@Test
	public void test1() {
		assertEquals(true, ob.isSum(25));
		//assertEquals(false, ob.isSum(25));
	}
	
	@Test
	public void test2() {
		assertEquals(6, ob.sumEven(23154));
		//assertEquals(10, ob.sumEven(23154));
	}

}