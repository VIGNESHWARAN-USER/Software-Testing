package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("button#tabButton")).click();
		driver.findElement(By.cssSelector("button#windowButton")).click();
		driver.findElement(By.cssSelector("button#messageWindowButton")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		itr.next();
		itr.next();
		itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
	}
}
