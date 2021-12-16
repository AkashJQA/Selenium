package javaScripter;

import org.baseutility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagedownElemnt {

	public static void main(String[] args) throws InterruptedException {
		

		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();
		
		driver.get("https://demoqa.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.tagName("path"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		Thread.sleep(5000);
		element.click();
		
		
		

	}

}
