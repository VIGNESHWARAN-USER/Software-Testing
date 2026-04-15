package selenium4;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class ScreenshotDemo {
    public static void main(String args[]) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://testim.io");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File("screenshots/screen.png"));

        driver.quit();
    }
}