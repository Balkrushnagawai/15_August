package march_12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotMultiple {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.policybazaar.com");
		for(int i=0; i<5; i++)
		{
			TakesScreenshot take = (TakesScreenshot)driver;
			File src =take.getScreenshotAs(OutputType.FILE);
			File dest = new File("E:\\28th May batch 1\\Auto ScreenShot\\Akshay"+i+".jpg");
			FileHandler.copy(src, dest);
		}
		
	}

}
