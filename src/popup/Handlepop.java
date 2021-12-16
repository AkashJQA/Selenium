package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/alerts");
		
		 Thread.sleep(2000);
		 
		//WebElement gettext = driver.findElement(By.xpath("//button[@id='alertButton']"));
		 
		WebElement gettext = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		gettext.click();
		
		Alert alert=driver.switchTo().alert();
		
		 Thread.sleep(2000);
			
		alert.sendKeys("Akash jadhav");
		 Thread.sleep(2000);
		alert.accept();
		 Thread.sleep(2000);
		//alert.getText();
		
String gettext1=alert.getText();
System.out.println(gettext1);

driver.quit();
	
		
		
		
		

	}

}
