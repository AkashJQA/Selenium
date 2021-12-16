package basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItdemao {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.xpath("//span[@class='button__text'][1]")).click();
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\AutoItScripts\\chromeopen.exe");
			

		
	}

}
