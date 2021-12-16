package basic;

import org.baseutility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hiturl {

	public static void main(String[] args) {
	BaseUtilities obj= new BaseUtilities();
		
		WebDriver driver=obj.startup("chrome");
		
		driver.get("https://demoqa.com/checkbox");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.google.co.in");
		
		//driver.navigate().to("https://demoqa.com/checkbox");
		System.out.println("Hi");
		
		WebElement Checkbox = driver.findElement(By.cssSelector(".rct-title"));
		
		
		
		System.out.println(Checkbox.isDisplayed());
		System.out.println(Checkbox.isEnabled());
		
		

	}

}
