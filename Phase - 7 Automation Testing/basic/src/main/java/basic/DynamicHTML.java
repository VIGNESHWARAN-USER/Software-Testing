package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHTML {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebElement addABox = driver.findElement(By.id("adder"));
		
		addABox.click();
		
		WebElement box = driver.findElement(By.id("box0"));
		
		System.out.println("Width "+box.getCssValue("width"));
		System.out.println("Height "+box.getCssValue("height"));
		System.out.println("BG Color "+box.getCssValue("background-color"));
		System.out.println("Border "+box.getCssValue("border"));
		System.out.println("Margin "+box.getCssValue("margin"));
		
		
		String expectedColor = "rgba(255, 0, 0, 1)";
		
		if(expectedColor.equals(box.getCssValue("background-color"))) System.out.println("Expected color found");
		else System.out.println("Expected color not	 found");
	}
}
