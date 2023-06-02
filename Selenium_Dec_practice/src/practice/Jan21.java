package practice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Jan21 {
	public static void main (String[]args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		//User ID :	mngr94195 valid for 20days in guru99site
		//Password :rYdysUh   valid for 20days in guru99site
		//AlertPopUp
		WebElement clkHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clkHere.click();
		Thread.sleep(5000);
		WebElement id = driver.findElement(By.xpath("//input[@name='emailid']"));
		id.sendKeys("mngr94195");
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Alert alert = driver.switchTo().alert();
		String text =alert.getText();
		System.out.println(text);
		alert.accept();
		TakesScreenshot take = (TakesScreenshot)driver;
		File src =take.getScreenshotAs(OutputType.FILE);
		File dest = new  File("E:\\28th May batch 1\\Auto ScreenShot\\A1.jpeg");
		FileHandler.copy(src, dest);
		
	}

}
