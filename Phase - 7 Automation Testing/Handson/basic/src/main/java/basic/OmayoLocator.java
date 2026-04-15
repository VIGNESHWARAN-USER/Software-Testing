package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoLocator {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.className("dropbtn"));
		
		dropdown.click();
		Thread.sleep(5000);
		
		WebElement flipkart = driver.findElement(By.xpath("//a[text() = \"Flipkart\"]"));
		flipkart.click();
		
	}
}
