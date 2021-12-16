package org.baseutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtilities {
	
	WebDriver driver;
	public WebDriver startup (String BrowserName) {
		
		
		String projectPath =System.getProperty("user.dir");
		System.out.println("projectPath="+projectPath);
	
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\download\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
		}
		else if (BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
			driver=new FirefoxDriver();
			
	}
		return driver;
	}

}

