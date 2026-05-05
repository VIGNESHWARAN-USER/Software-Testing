package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage{

	WebDriverWait wait;
	JavascriptExecutor js;
	
	public ProductsPage(WebDriver driver1) {
		super(driver1);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
	}
	
	By productsButton = By.xpath("//a[@href = \"/products\"]");
	By searchBox = By.xpath("//input[@id = \"search_product\"]");
	By searchButton = By.xpath("//button[@id = \"submit_search\"]");
	By productNames = By.xpath("//div[@class = \"single-products\"]/div/p");
	
	public void clickProductsButton()
	{
		safeClick(productsButton);
	}
	
	public void setSearchValue(String value)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).sendKeys(value);
	}
	
	public void clickSearchButton()
	{
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
		js.executeScript("arguments[0].scrollIntoView()", button);
		safeClick(searchButton);
	}
	
	public List<WebElement> getProductsNames() {
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productNames));
	    return driver.findElements(productNames);
	}
	
	public boolean isSearchKeyValid(String value)
	{
		
		handleAdIfPresent();
		
		clickProductsButton();
		setSearchValue(value);
		clickSearchButton();
		List<WebElement> productsNames = getProductsNames();
		
		for(WebElement product: productsNames)
		{
			System.out.println(product.getText());
			if (product.getText().matches("(?i).*" + value + ".*"))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isSearchKeyInvalid(String value) {

	    clickProductsButton();
	    setSearchValue(value);
	    clickSearchButton();

	    List<WebElement> products = driver.findElements(productNames);

	    if (products.isEmpty()) {
	        return true; 
	    }

	    for (WebElement product : products) {
	        if (product.getText().equalsIgnoreCase(value)) {
	            return false;
	        }
	    }

	    return true;
	}
}