package actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;

public class HomeActions extends BaseAction{
	
	WebDriverWait wait;
	HomePage hp;

	public HomeActions(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		hp = new HomePage();
	}
	
	public void setSearchKeyAndEnter(String key)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.searchInput)).sendKeys(key, Keys.ENTER);
	}

	
	public List<String> getProductNames()
	{
		List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(hp.productsNames));
		List<String> productNames = new ArrayList<>();
		
		for(WebElement product:products)
		{
			productNames.add(product.getText());
		}
		
		return productNames;
	}
	
	public String checkValidSearchKey(String key)
	{
		setSearchKeyAndEnter(key);
		List<String> products = getProductNames();
		
		for(String product: products)
		{
			if(product.contains(key))
			{
				return "contain";
			}
		}
		return "not contain";
	}
	
	public void goToLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.myAccount)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.loginLink)).click();
	}

}
