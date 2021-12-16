package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\download\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.get("https://admin-demo.nopcommerce.com/login"); //url hit



		
		String s=driver.getTitle();

		driver.navigate().refresh();

		System.out.println(s);

		//WebElement username =
		
		driver.findElement(By.cssSelector(".email.valid")).clear();
		
		driver.findElement(By.cssSelector(".email.valid")).sendKeys("admin@yourstore.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		
		password.clear();
		
		password.sendKeys("admin");
		
		
				
				
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//username.sendKeys("admin@yourstore.com");
		
		
		

		//username.clear();



		driver.close();






	}

}
