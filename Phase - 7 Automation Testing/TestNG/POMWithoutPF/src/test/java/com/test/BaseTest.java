package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dbPage;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
