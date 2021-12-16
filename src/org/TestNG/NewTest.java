package org.TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeClass
	public void url() {
		System.setProperty("webdriver.gecko.driver", "E:\\chromedriver.exe");

	}
	
	@Test
	public void m1 () {
		System.out.println("Hello");
	}
 
  
}
