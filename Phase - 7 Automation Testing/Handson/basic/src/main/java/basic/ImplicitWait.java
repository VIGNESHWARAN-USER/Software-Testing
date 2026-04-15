package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.className("dropbtn"));
		
		dropdown.click();
		
		WebElement flipkart = driver.findElement(By.xpath("//a[text() = \"Flipkart\"]"));
		flipkart.click();
		
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(expectedTitle.equals(driver.getTitle())) System.out.println("Navigation successfull");
		else System.out.println("Navigation failed");
	}
}
