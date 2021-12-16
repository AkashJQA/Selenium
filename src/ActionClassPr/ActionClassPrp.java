package ActionClassPr;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPrp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.get("https://www.ebay.com");
		
		Thread.sleep(2000);
		WebElement elem=driver.findElement(By.linkText("Electronics"));
		Thread.sleep(2000);
		Actions act=new Actions (driver);
		Thread.sleep(2000);
		act.moveToElement(elem).click().perform();
		
		driver.close();
		
		
		
		
		
		

	}

}
