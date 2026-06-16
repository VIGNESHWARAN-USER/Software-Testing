package basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class JSLoginAutomation {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("document.getElementsByTagName(\"input\")[0].value = 'Vigneshwaran'");
        js.executeScript("document.getElementsByTagName(\"input\")[1].value = 'M'");
        js.executeScript("document.getElementsByTagName(\"input\")[2].value = 'vigneshwaran.coder@gmail.com'");
        js.executeScript("document.getElementsByTagName(\"input\")[3].value = '1234'");
        js.executeScript("document.getElementsByTagName(\"input\")[4].value = '1234'");
        
        js.executeScript("document.getElementsByClassName(\"btn\")[0].click()");
        
        if(js.executeScript("return document.URL;").toString().equals("https://www.hyrtutorials.com/p/add-padding-to-containers.html?name=Vigneshwaran&name=M"))
        {
        	System.out.println("Login success");
        }
        else
        {
        	System.out.println("Login failed");
        }
        
        System.out.println("Domain Name: "+js.executeScript("return document.domain;").toString());
        
        WebElement facebook = (WebElement) js.executeScript("return document.querySelector('.fa.fa-facebook')");
        js.executeScript("arguments[0].scrollIntoView(true);", facebook);
        
        driver.quit();
	}
}
