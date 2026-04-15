package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		WebElement parentFrame = driver.findElement(By.cssSelector("#frame1"));
		
		driver.switchTo().frame(parentFrame);
		
		System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		
	}
}
