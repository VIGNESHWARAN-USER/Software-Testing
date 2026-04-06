package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		
		WebElement close = driver.findElement(By.xpath("//*[name() = \"svg\" and @id = \"close-small\"]"));
		close.click();
		
		WebElement signIn = driver.findElement(By.xpath("//a[contains(text() , 'Sign in')]"));
		signIn.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
		username.sendKeys("2k22cse161@kiot.ac.in");
		
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']"));
		password.sendKeys("vetrivelsonu1234");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@type = 'submit']"));
		submit.click();
		
		String expectedTitle = "Feed | LinkedIn";
		String actualTitle = driver.getTitle();
		
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
	}
}
