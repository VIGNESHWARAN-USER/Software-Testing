package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	By username = By.name("username");

	By password = By.name("password");

	By titleText = By.xpath("//h5");

	By login = By.xpath("//button[text() = \" Login \"]");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void setUsername(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}

	public String getTitleText() {
		return driver.findElement(titleText).getText();
	}

	public void login(String name, String pass) {
		setUsername(name);
		setPassword(pass);
		clickLogin();
	}
}
