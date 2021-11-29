package com.testng_feature;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Class {
	@Test
	private void method1() {
System.out.println("Method1");
	}
	//@Ignore
	@Test(enabled=true)
	private void method2() {
System.out.println("Method2");
	}
	
@Test(enabled=false)
private void method3() {
System.out.println("Method3");
}
@Test
private void method4() {
System.out.println("Method4");
}
}
