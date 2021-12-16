package waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
	//driver.get("https://www.facebook.com/");
	
	//String url="https://www.facebook.com/";
	
	driver.navigate().to("https://www.facebook.com");
		

	WebDriverWait wait= new WebDriverWait(driver, 40);
	
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")));
	
	element.click();
	
	Thread.sleep(2000);
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select select= new Select(day);
	
	List<WebElement> options = select.getOptions();
	
	int i=options.size();
	
	System.out.println("size of day dropdown is "+i);	
	for (WebElement webElement : options) {
	
		String s=webElement.getText();
		System.out.println(s);
		
	}
	
	driver.close();
	
	}

}
