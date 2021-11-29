package com.testng_feature;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeTest
	private void setproperty() {
		System.out.println("BeforeTest");

	}
	@BeforeClass
	private void clss() {
System.out.println("BeforeClass");
	}
	@BeforeMethod
	private void befor() {
System.out.println("BeforeMethod");
	}
	@BeforeSuite
	private void afte() {
 System.out.println("Before Suite");
	}
	@Test
	private void tst() {
System.out.println("Test");
	}
	
	@Test
	private void tst1() {
System.out.println("Test1");
	}
	@AfterSuite
	private void afSuite() {
System.out.println("AfterSutie");
	}
	@AfterTest
	private void afTest() {
System.out.println("AfterTest");
	}
	@AfterClass
	private void afClass() {
System.out.println("AfterClass");
	}
	@AfterMethod
	private void afMethod() {
System.out.println("After MEthod");
	}

}
