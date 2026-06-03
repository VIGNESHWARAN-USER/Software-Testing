package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActionDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement src = driver.findElement(By.linkText("compendiumdev"));
		
			
		act.keyDown(Keys.CONTROL).moveToElement(src).click().keyUp(Keys.CONTROL).perform();
		
		Set<String> windows = driver.getWindowHandles();
		
		String parent = "";
		
		for(String i: windows)
		{
			driver.switchTo().window(i);
			if(driver.getTitle().equals("404 Page not found | Test Pages"))
				System.out.println("Switching to child window: " + driver.getTitle());
			else if(driver.getTitle().equals("omayo (QAFox.com)"))
				parent = i;
		}
		
		driver.switchTo().window(parent);
		System.out.println("Switching to parent window: " + driver.getTitle());
		
		//System.out.println(driver.findElement(By.xpath("//p[text() = \"Dropped!\"]")).getText());
	}
}
