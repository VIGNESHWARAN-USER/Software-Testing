package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public static WebDriver driver;
	
	public BasePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, driver);
	}
}
