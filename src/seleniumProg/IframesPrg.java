package seleniumProg;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframesPrg {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,300)","");
		
	 List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		int frame= iframe.size(); 
	 System.out.println("No of frames :"+frame);
	 
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	 Actions ac = new Actions(driver);
	 driver.switchTo().frame(frame1);
		 ac.contextClick();
		

	}

}
