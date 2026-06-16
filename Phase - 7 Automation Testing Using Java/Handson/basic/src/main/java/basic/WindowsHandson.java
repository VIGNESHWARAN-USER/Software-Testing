package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandson {
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String mainWindow = driver.getWindowHandle();
		
		System.out.println("Parent window title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id = \"j_idt88:new\"]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{	
			driver.switchTo().window(itr.next());
			if(driver.getTitle().equals("Dashboard")) break;
		}
		
		System.out.println("Child window title: "+driver.getTitle());
		
		System.out.println("Returning to Parent...");
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("//*[@id = \"j_idt88:j_idt91\"]")).click();
		
		windows = driver.getWindowHandles();
		
		System.out.println("Parent window title: "+driver.getTitle());
		
		itr = windows.iterator();
		
		while(itr.hasNext())
		{	
			driver.switchTo().window(itr.next());
			if(driver.getCurrentUrl().equals("https://www.leafground.com/table.xhtml")) break;
		}
		
		System.out.println("Child window title: "+driver.getTitle());
		
		driver.quit();
	}
}
