package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

	By titleText = By.xpath("//h6");

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public String getTitleText() {
		return driver.findElement(titleText).getText();
	}

}
