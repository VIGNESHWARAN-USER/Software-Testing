package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWaitAutomation {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/index.html");
		
		driver.findElement(By.cssSelector("a#login2")).click();	
		
		
		WebElement username = driver.findElement(By.cssSelector("input#loginusername"));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.cssSelector("input#loginpassword"));
		password.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#logout2")));
		
		WebElement logout = driver.findElement(By.cssSelector("a#logout2"));
		
		if("Log out".equals(logout.getText()))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
}
