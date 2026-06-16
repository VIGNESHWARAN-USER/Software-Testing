package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
			
		WebElement button = driver.findElement(By.xpath("//button[text() = \" Double click Here   \"]"));
		act.moveToElement(button).doubleClick().perform();
		
		driver.quit();
	}
}
