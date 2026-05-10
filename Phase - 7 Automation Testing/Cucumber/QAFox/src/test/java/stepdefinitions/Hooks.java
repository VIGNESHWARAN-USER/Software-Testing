package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriverWait wait;
    
    @Before
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        
        driver.set(new ChromeDriver(options));
        wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
    }
    
    @After
    public void tearDown() {
    	if(driver.get() != null)
    	{
    		driver.get().quit();
    		driver.remove();
    	}
    }
}
