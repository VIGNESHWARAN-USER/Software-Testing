package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
