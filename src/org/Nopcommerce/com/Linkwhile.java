package org.Nopcommerce.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkwhile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/link.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.xpath("(//a[text()=\"click here\"])[1]"));
		 
		link.click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement link2 = driver.findElement(By.xpath("(//a[text()=\"click here\"])[2]"));
		
		link2.click();
		
		
		
			
		
	}

}
