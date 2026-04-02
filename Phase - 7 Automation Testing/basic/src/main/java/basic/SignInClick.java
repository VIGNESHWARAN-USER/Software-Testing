package basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInClick {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement signIn = driver.findElement(By.);
		signIn.click();
		WebElement emailInput = driver.findElement(By.id("identifierId"));
		emailInput.sendKeys("vigneshwaran.coder@gmail.com", Keys.ENTER);
		System.out.println("Page title is: "+driver.getTitle());
		//driver.close();
	}
}
