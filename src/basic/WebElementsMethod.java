package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
	driver.navigate().to("https://www.facebook.com");
	
	driver.navigate().refresh();
	
	boolean loginbutton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isDisplayed();
	
	System.out.println("Login button is "+ loginbutton);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	 
	
	WebElement female = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
	
	String s=female.getText();
	System.out.println(s);
	
	boolean radio = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).isEnabled();
	
	Thread.sleep(2000);
	System.out.println("radio button is selected "+radio);
	
	driver.quit();

	}

}
