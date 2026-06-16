package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AddressPage;
import pages.HomePage;

public class AddressAction extends BaseAction{

	WebDriverWait wait;
	HomePage hp;
	AddressPage ap;
	
	public AddressAction(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		hp = new HomePage();
		ap = new AddressPage();
	}
	
	public void clicknewAddressButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.newAddress)).click();
	}
	
	public void clickContinueButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.continueButton)).click();
	}
	
	public void fillFormFileds(String firstName, String lastName, String address, String city, String postCode, String country, String zone)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.firstName)).sendKeys(firstName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.lastName)).sendKeys(lastName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.address)).sendKeys(address);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.city)).sendKeys(city);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.postCode)).sendKeys(postCode);
		
		Select countrySelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(ap.country)));
		countrySelect.selectByContainsVisibleText(country);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ap.zone)).sendKeys(zone);
	}
	
	public void clickAddressBookLink()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.AddressBook)).click();
	}
	
	public String getGreetMessage()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ap.greetMessage)).getText();
	}

}
