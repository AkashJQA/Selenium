package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassDemo {

	public static void main(String[] args) {
		
	 {
				System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.ebay.com/");
				
			 WebElement elec = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab'][1]"));
			
			 Actions action = new Actions(driver);
			 
			 action.moveToElement(elec).click().build().perform();
				
				

		
				

			}
 
		}


	}

