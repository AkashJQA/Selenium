package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfTextBox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		
		System.out.println(nooflinks.size()); // find the count 
		
		int count=nooflinks.size();
		System.out.println("count of link="+count);
		
		
		
		//finding  text for all links use below method
		
		for (WebElement webElement : nooflinks) {
			
			System.out.println(webElement.getText());
			
		}
		
		driver.close();
		
		
		

	}

}
