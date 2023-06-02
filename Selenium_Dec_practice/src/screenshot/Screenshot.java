package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.drive","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://github.com/");
		Thread.sleep(5000);
		TakesScreenshot take =(TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest =new File("E:\\28th May batch 1\\Auto ScreenShot\\Archana.jpg");
		FileHandler.copy(src, dest);
	}
}
