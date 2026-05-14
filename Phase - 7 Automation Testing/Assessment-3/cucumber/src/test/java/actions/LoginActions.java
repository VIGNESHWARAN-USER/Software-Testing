package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.LoginPage;

public class LoginActions extends BaseAction {
	
	WebDriverWait wait;
	LoginPage lp;
	HomePage hp;
	
	public LoginActions(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		lp = new LoginPage();
		hp = new HomePage();
	}
	
	public void login(String email, String password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.myAccount)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(hp.loginLink)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(lp.email)).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lp.password)).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lp.loginButton)).click();
	}

}
