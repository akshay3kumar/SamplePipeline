package com.package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	
	private double x;
	private double y;
	Calculator c;
	public Test1() {
		this.x = 100;
		this.y = 20;
		this.c=new Calculator(x, y);
	}
	
	 @Test
	 public void testsum() {
		 
		 Assert.assertEquals(x+y, c.sum());
	 }
	 @Test
	 public void testDiff() {
		
		 Assert.assertEquals(x-y, c.difference());
	 }
	 @Test
	 public void testMul() {
		 
		 Assert.assertEquals(x*y, c.mult());
	 }
	 @Test
	 public void testDiv() {
		 
		 Assert.assertEquals(x/y, c.div());
	 }
}
