package ActionClassPr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //

		driver.get("https://demoqa.com/droppable");


		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		String s=drop.getText();

		System.out.println(s);



		Actions act=new Actions(driver);

		act.dragAndDrop(drag, drop).perform();



		act.contextClick(drop).perform();






	}

}
