package autoit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileRead {
	public static void main(String args[]) throws InterruptedException, IOException {
		String downloadFilePath = System.getProperty("user.dir") + File.separator + "downloads";
		
		System.out.println(downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://dotesthere.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@download = \"sample.pdf\"]"))).click().perform();
		
		Thread.sleep(3000);
		
		File downloadedFile = new File(downloadFilePath+File.separator+"sample.pdf");
		
		if(downloadedFile.exists())
		{
			System.out.println("File downloaded");
		}
		else
		{
			System.out.print("File not downloaded");
		}
		
		PDDocument doc = Loader.loadPDF(downloadedFile);
		PDFTextStripper strip = new PDFTextStripper();
		
		String content = strip.getText(doc);
		
		System.out.println(content);
		
	}
}
