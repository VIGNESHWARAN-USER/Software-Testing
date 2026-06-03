package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

    WebDriverWait wait;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By formPassword = By.xpath("//input[@data-qa='password']");
    private By days = By.xpath("//input[@data-qa='days']");
    private By months = By.xpath("//input[@data-qa='months']");
    private By years = By.xpath("//input[@data-qa='years']");
    private By firstName = By.xpath("//input[@data-qa='first_name']");
    private By lastName = By.xpath("//input[@data-qa='last_name']");
    private By address = By.xpath("//input[@data-qa='address']");
    private By country = By.xpath("//select[@data-qa='country']");
    private By state = By.xpath("//input[@data-qa='state']");
    private By city = By.xpath("//input[@data-qa='city']");
    private By zipCode = By.xpath("//input[@data-qa='zipcode']");
    private By mobileNumber = By.xpath("//input[@data-qa='mobile_number']");
    private By createAccount = By.xpath("//button[@data-qa='create-account']");
    private By titles = By.xpath("//div[@class='radio-inline']/label/div");
    private By greet = By.xpath("//b");
    private By errorMsg = By.xpath("//p[text() = \"Email Address already exist!\"]");
    
    public void setFormPassword(String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(formPassword)).sendKeys(pwd);
    }

    public void setDays(String day) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(days)).sendKeys(day);
    }

    public void setMonths(String month) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(months)).sendKeys(month);
    }

    public void setYears(String year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(years)).sendKeys(year);
    }

    public void setFirstName(String fname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fname);
    }

    public void setLastName(String lname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(lname);
    }

    public void setAddress(String addr) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys(addr);
    }

    public void setCountryName(String countryName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(country)).sendKeys(countryName);
    }

    public void setState(String st) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(state)).sendKeys(st);
    }

    public void setCity(String c) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys(c);
    }

    public void setZipCode(String zip) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCode)).sendKeys(zip);
    }

    public void setMobileNumber(String mobile) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNumber)).sendKeys(mobile);
    }

    public void clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccount)).click();
    }

    public void setTitle(String title) {
        List<WebElement> titleList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(titles));

        if (title.equalsIgnoreCase("Mr.")) {
            titleList.get(0).click();
        } else {
            titleList.get(1).click();
        }
    }
    
    public String getMessage()
    {
    	return wait.until(ExpectedConditions.elementToBeClickable(greet)).getText();
    }
    
    public String getErrorMessage()
    {
    	return wait.until(ExpectedConditions.elementToBeClickable(errorMsg)).getText();
    }

    public void signup(String title, String password, String firstName, String lastName,
                       String address, String countryName, String city,
                       String state, String zip, String mobileNumber) {

        setTitle(title);
        setFormPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCountryName(countryName);
        setCity(city);
        setState(state);
        setZipCode(zip);
        setMobileNumber(mobileNumber);
        clickCreateAccount();
    }
}