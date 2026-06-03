package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStepDefinition {

    WebDriver driver;
    WebDriverWait wait;
    
    @Before
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @After
    public void tearDown() {
    	driver.quit();
    }

    @Given("the user launches the home page")
    public void launchHomePage() {
        driver.get("https://demoblaze.com");
    }

    @When("the user clicks the login button")
    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
    }

    @When("the user opens the login pop-up")
    public void openLoginPopup() {
        clickLoginButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
    }

    @Then("the login pop-up should be displayed")
    public void verifyLoginPopup() {
        Assert.assertTrue(
            driver.findElement(By.id("logInModal")).isDisplayed(),
            "Login pop-up is not visible"
        );
    }

    @When("the user enters username {string}")
    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
            .sendKeys(username);
    }

    @When("the user enters password {string}")
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")))
            .sendKeys(password);
    }

    @When("the user submits login")
    public void submitLogin() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Then("the user should see welcome message {string}")
    public void verifyWelcomeMessage(String expectedText) {
        String actualText = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
        ).getText();

        Assert.assertEquals(actualText, expectedText);
    }

    @Then("an alert should appear with message {string}")
    public void verifyAlert(String expectedMessage) {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String actualMessage = alert.getText();

        alert.accept();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}