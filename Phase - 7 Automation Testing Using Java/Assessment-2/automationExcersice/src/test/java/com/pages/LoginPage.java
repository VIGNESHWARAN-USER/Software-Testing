package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	WebDriverWait wait;
	
    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement email;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;
    
    private By greet = By.xpath("//a[contains(text(), \" Logged in as \")]");
    private By errorMsg = By.xpath("//p[text() = \"Your email or password is incorrect!\"]");

  

    public void setUsername(String name) {
        username.sendKeys(name);
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setLoginEmail(String mail) {
        loginEmail.sendKeys(mail);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickSignUp() {
        signUpButton.click();
    }
    
    public String getMessage()
    {
    	return wait.until(ExpectedConditions.elementToBeClickable(greet)).getText();
    }
    
    public String getErrorMessage()
    {
    	return wait.until(ExpectedConditions.elementToBeClickable(errorMsg)).getText();
    }

    public void signUp(String name, String email)
    {
    	setUsername(name);
    	setEmail(email);
    	clickSignUp();
    }
    
    public void logIn(String name, String pass)
    {
    	setLoginEmail(name);
    	setPassword(pass);
    	clickLogin();
    }
}