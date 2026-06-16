package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@name = \"q\"]"));
		act.moveToElement(search).contextClick().perform();
		
		driver.quit();
	}
}
