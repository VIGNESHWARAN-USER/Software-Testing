package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void testSite()
	{
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://jsonplaceholder.typicode.com");
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertTrue(url.contains("json"));
			
		}finally {
			driver.quit();
		}
	}
}	
