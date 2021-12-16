package ScreenshotPr;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseutility.BaseUtilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeaScreenshot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\download\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\Admin\\Desktop\\Sdy\\Selenium\\Screenshot\\firstscreenshot2.jpg");
		try {
			Files.copy(f, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
