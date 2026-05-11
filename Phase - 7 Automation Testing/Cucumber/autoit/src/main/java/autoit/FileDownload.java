package autoit;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	public static void main(String args[]) throws InterruptedException {
		String downloadFilePath = System.getProperty("user.dir") + File.separator + "downloads";
		
		System.out.println(downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id = \"downloadButton\"]")).click();
		
		Thread.sleep(3000);
		
		File downloadedFile = new File(downloadFilePath+File.separator+"sampleFile.jpeg");
		
		if(downloadedFile.exists())
		{
			System.out.println("File downloaded");
		}
		else
		{
			System.out.print("File not downloaded");
		}
		
	}
}
