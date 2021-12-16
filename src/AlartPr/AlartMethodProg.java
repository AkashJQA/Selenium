package AlartPr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartMethodProg {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver(); //

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		WebElement click = driver.findElement(By.xpath("//button[@id='promtButton']"));
		click.click();
		
		

		Alert alertpop	=driver.switchTo().alert();
		alertpop.sendKeys("Akash");
		Thread.sleep(3000);
		System.out.println(alertpop.getText());


		
		alertpop.accept();

		Thread.sleep(3000);

		driver.close();




		}

}
