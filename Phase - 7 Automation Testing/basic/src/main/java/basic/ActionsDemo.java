package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement element = driver.findElement(By.id("blogsmenu"));
		
		
		act.moveToElement(element).perform();
		WebElement option2 = driver.findElement(By.xpath("//li/a[@href = \"https://selenium-by-arun.blogspot.com/\"]"));
		act.moveToElement(option2).click().build().perform();
	}
}
