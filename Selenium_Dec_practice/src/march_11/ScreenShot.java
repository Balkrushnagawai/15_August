package march_11;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main (String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TakesScreenshot take =(TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\28th May batch 1\\Auto ScreenShot\\krish1.jpg");
		FileHandler.copy(src, dest);
		
	}
	
	

}
