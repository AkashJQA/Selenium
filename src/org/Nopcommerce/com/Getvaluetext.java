package org.Nopcommerce.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getvaluetext {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/Admin/Category/List");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		login.click();

		List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='SearchPublishedId']"));

		for (WebElement webElement : alloptions) {


			System.out.println(webElement.getText());

		}
		WebElement alloptionslist = driver.findElement(By.xpath("//select[@id='SearchPublishedId']"));
		
		Select select= new Select(alloptionslist);
		
		select.selectByVisibleText("Published only");

		Thread.sleep(2000);
		
		
	}

}
