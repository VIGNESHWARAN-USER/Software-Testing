package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delhivery {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.delhivery.com/");
		WebElement xpath = driver.findElement(By.xpath("//a[text() = \" Track order\"]"));
		WebElement css = driver.findElement(By.cssSelector("a.tab-link.custom-tab-link.active"));
		WebElement normal = driver.findElement(By.className("tab-link.custom-tab-link.active"));
		if(xpath.equals(css) || css.equals(normal))
		{
			System.out.println(true);
		}
		else 
		{
			System.out.println(false);
		}
		//driver.close();
	}
}
