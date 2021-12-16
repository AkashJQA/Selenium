package ScreenshotPr;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassScreenshot {

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			System.setProperty("webdriver.chrome.driver","C:\\download\\chromedriver.exe");

			WebDriver driver=new ChromeDriver(); //

			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		
			Robot robot= new Robot();
			
			BufferedImage obj=robot.createScreenCapture(new Rectangle(new Dimension(1280,580)));
			
			try {
				ImageIO.write(obj, "jpg", new File("C:\\Users\\Admin\\Desktop\\Sdy\\Selenium\\Screenshot.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
