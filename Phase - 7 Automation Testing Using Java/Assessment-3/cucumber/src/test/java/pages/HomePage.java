package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public By searchInput = By.xpath("//input[@name = \"search\"]");
	public By productsNames = By.xpath("//div[@class = \"product-thumb\"]/div[2]/div/h4");
	public By AddressBook = By.xpath("//a[text() = \"Address Book\"]");
	public By myAccount = By.xpath("//i[@class = \"fa fa-user\"]");
	public By loginLink = By.xpath("//a[@href = \"https://tutorialsninja.com/demo/index.php?route=account/login\"]");
}
