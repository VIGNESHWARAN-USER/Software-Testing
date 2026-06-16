package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	By loginButton = By.xpath("//a[@href = \"/login\"]");
	
	public void clickLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
	}
}	
