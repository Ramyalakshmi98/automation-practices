package com.testng_feature;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize {
	@Test
	@Parameters({"name","password"})
	private void para(String name,String password) {
		
System.out.println("name" +name);
System.out.println("Pass"+password);
	}

}
