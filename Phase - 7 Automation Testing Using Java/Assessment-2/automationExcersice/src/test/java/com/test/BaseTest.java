package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(com.utils.Listener.class)
public class BaseTest {
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--allow-all-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://automationexercise.com/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
