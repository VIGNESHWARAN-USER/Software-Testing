package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class ElementScreenshot {
    public static void main(String args[]) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testim.io");
        
        WebElement element = driver.findElement(By.xpath("//div/div[@class = \"upper-h-bar pink-bg\"]"));

        TakesScreenshot ts = (TakesScreenshot) element;

        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File("screenshots/element.png"));

        driver.quit();
    }
}