package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
		
	  @Test
	  public void loginTest() {
		  
		  driver.findElement(By.id("login2")).click();
		  driver.findElement(By.id("loginusername")).sendKeys("admin");
		  driver.findElement(By.id("loginpassword")).sendKeys("admin");
		  driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		 
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--start-maximized");
		  options.addArguments("--headless");
		  
		  driver = new ChromeDriver(options);
		  
		  driver.get("https://demoblaze.com");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  }
	
	  @AfterTest
	  public void afterTest() {
		driver.quit();  
	  }

}
