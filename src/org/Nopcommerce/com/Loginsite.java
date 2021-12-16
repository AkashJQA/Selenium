package org.Nopcommerce.com;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BasicProgram.ActionClass;

public class Loginsite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@class='email valid']"));

		String value = email.getAttribute("value");

		System.out.println(value);

		WebElement checkbox = driver.findElement(By.id("RememberMe"));

		checkbox.click();

		boolean isselected = checkbox.isSelected();

		System.out.println("checkbox is selected " + isselected);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		 
		Thread.sleep(2000);
		
		WebElement dashboard = driver.findElement(By.xpath("//i[@class='fa fa-bars']"));
		
		Actions act=new Actions((WebDriver) dashboard);
		
		act.moveToElement(dashboard).click();
		
		List<WebElement> catlog = driver.findElements(By.xpath("//i[@class='nav-icon fas fa-book']"));
		
 
		 for (WebElement webElement : catlog) {
			 String s=webElement.getText();
			 System.out.println(s);
			
			
		}
		 
		driver.close();
		
		

	}

}
