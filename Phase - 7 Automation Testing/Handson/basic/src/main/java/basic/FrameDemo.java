package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement frame = driver.findElement(By.cssSelector("#frame1"));
		
		driver.switchTo().frame(frame);
		
		System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		
	}
}
