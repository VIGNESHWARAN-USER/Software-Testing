package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	By greetMessage = By.xpath("//a[contains(text() , \"Welcome\")]");
	
	By laptopButton = By.xpath("//a[@id = \"itemc\"][2]");
	
	By laptop = By.xpath("//a[text() = \"MacBook Pro\"]");
	
	By productList = By.cssSelector("div#tbodyid div div div h4");
	
	public String getGreetMessage()
	{
		return driver.findElement(greetMessage).getText();
	}
	
}
