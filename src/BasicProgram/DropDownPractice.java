package BasicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPractice {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		Select select= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		//wait.uniti(ExpectedConditions.visibilityOfAllElementsLocatedBy(select);
		
		List<WebElement> getopn = select.getOptions();
		
		
		for (WebElement webElement : getopn) {
			
		System.out.println(webElement.getText());
		
		
			
			
		}
		
		
		
		//select.selectByValue("23");
		//select.selectByIndex(22);

	}

}
