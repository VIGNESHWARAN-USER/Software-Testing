package pages;

import org.openqa.selenium.By;

public class LoginPage {
	public By email = By.xpath("//input[@name = \"email\"]");
	public By password = By.xpath("//input[@name = \"password\"]");
	public By loginButton = By.xpath("//input[@value = \"Login\"]");
	
}	
