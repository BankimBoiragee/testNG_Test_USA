package com.usa.failTestRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_A {
	@Test
	public void getTest1() {
		Assert.assertTrue(true);
		System.out.println("getTest1");
	}
	@Test
	public void getTest2() {
		Assert.assertTrue(true);
		System.out.println("getTest2");
	}
	@Test
	public void getTest3() {
		Assert.assertTrue(true);
		System.out.println("getTest3");
	}
}
