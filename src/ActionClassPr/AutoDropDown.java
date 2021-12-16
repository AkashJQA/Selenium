package ActionClassPr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.get("https://www.makemytrip.com/flights");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body")).click();
		
		WebElement fromcitym = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		fromcitym.click();

		
		Thread.sleep(2000);
		
		WebElement fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		
		
		fromcity.sendKeys("latur",Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		fromcity.sendKeys(Keys.ENTER);
		
		

	}

}
