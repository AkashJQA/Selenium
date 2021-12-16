package ScreenshotPr;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\download\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); //

		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(39, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ss= (TakesScreenshot) driver;
		File f=ss.getScreenshotAs(OutputType.FILE);
		
		File d=new File ("C:\\Users\\Admin\\Desktop\\Sdy\\Selenium\\src\\ScreenshotPr\\Screenshot5.java");
		
		try
		{
			Files.copy(f, d);
		}
		catch
			(IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		
		
		

	}

}
