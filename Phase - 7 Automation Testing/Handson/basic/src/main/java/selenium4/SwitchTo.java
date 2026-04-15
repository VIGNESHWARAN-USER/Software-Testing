package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://demoqa.com/sample");
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.quit();
	}
}
