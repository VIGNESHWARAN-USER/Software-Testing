package com.page;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By login = By.xpath("//a[@id = \"login2\"]");
	
	By username = By.xpath("//input[@id = \"loginusername\"]");
	
	By password = By.xpath("//input[@id = \"loginpassword\"]");
	
	By loginButton = By.xpath("//button[text() = \"Log in\"]");
	
	
	
	public void clickLoginIcon()
	{
		driver.findElement(login).click();
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void setUsername(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public boolean isLoginPresent()
	{
		return driver.findElement(login) != null;
	}
	
	public void login(String name, String pass)
	{
		clickLoginIcon();
		setUsername(name);
		setPassword(pass);
		clickLoginButton();
	}
	
	public String handleAlert()
	{
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		
		alert.accept();
		
		return message;
	}
	
}
