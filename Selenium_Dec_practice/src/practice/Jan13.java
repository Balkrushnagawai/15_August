package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Jan13 {
	public static void main(String[]args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		TakesScreenshot take = (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\28th May batch 1\\Auto ScreenShot\\screenshot2.jpeg");
		Thread.sleep(2000);
		FileHandler.copy(src, dest);
	
	}

}
