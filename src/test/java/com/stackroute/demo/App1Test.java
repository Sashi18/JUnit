package com.stackroute.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class App1Test {

	@Test
	public void test() {
		App1 ob = new App1();
		assertEquals(true, ob.setLimit(55));
		//assertEquals(true, ob.setLimit(501));
	}

}