package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsAndColumns {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id = \"table1\"]/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = \"table1\"]/tbody/tr"));
       
        System.out.println("No. of Columns "+columns.size());
        System.out.println("No. of Rows "+(rows.size()+1));
        
	}
}
