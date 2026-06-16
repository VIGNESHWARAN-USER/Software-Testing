package pages;

import org.openqa.selenium.By;

public class AddressPage {
	public By newAddress = By.xpath("//a[text() = \"New Address\"]");
	public By firstName = By.xpath("//input[@name = \"firstname\"]");
	public By lastName = By.xpath("//input[@name = \"lastname\"]");
	public By address = By.xpath("//input[@name = \"address_1\"]");
	public By city = By.xpath("//input[@name = \"city\"]");
	public By postCode = By.xpath("//input[@name = \"postcode\"]");
	public By country = By.xpath("//select[@name = \"country_id\"]");
	public By zone = By.xpath("//select[@name = \"zone_id\"]");
	public By continueButton = By.xpath("//input[@value = \"Continue\"]");
	public By greetMessage = By.xpath("//div[text() = \"Your address has been successfully added\"]");
}
