package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSelect {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/select.xhtml;jsessionid=node01eoe4m4ary1jpew30i04p8uz114556587.node0");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        String[] values = {"AWS", "Appium", "Selenium WebDriver"};

        for (String value : values) {
        	
            
            wait.until( ExpectedConditions.elementToBeClickable(By.xpath("//span[@class = \"ui-button-icon-primary ui-icon ui-icon-triangle-1-s\"]"))).click();

            
            List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@id = \"j_idt87:auto-complete_panel\"]/ul/li")));

            
            boolean found = false;
            for (WebElement option : options) {
                String text = option.getText();

                if (text.equals(value)) {
                    option.click();
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Value not found: " + value);
            }
        }
        
       driver.quit(); 
    }
}