package parameterizedProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DPDemo {
	
	public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();  
	
	
	@Test(dataProvider = "testData", dataProviderClass = DPClass.class)
	public void test(String keyword)
	{
		driver.get().findElement(By.name("q")).sendKeys(keyword, Keys.ENTER);
		
		System.out.println(keyword);
	}
	
	@BeforeMethod
	public void setUp() {
		
		driver.set(new ChromeDriver());
		
		driver.get().manage().deleteAllCookies();
		
		driver.get().get("https://google.co.in");
		
		driver.get().manage().window().maximize();
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
	    if (driver.get() != null) {
	        driver.get().quit();
	        driver.remove();
	    }
	}
}
