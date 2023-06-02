package april_04;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SelectAndScreenshot {
	public static void main (String[]args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAcc.click();
		Thread.sleep(3000);
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(monthDropDown);
		s.selectByIndex(5);
		
		//For single screenshot
		TakesScreenshot take = (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\28th May batch 1\\Auto ScreenShot\\bal.jpeg");
		FileHandler.copy(src, dest);
		
		//For Multiple Screenshot
		for(int i=0; i<=4; i++)
		{
			TakesScreenshot take1 = (TakesScreenshot)driver;
			File src1 = take1.getScreenshotAs(OutputType.FILE);
			File dest1 = new File("E:\\28th May batch 1\\Auto ScreenShot\\"+i+"bal.jpeg");
			FileHandler.copy(src1, dest1);
		}
		//for date and Time
		Date date = new Date();
		String fileName = date.toString().replace(":", " ").replace("-","_");
		TakesScreenshot take2 = (TakesScreenshot)driver;
		File src2 = take2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("E:\\28th May batch 1\\Auto ScreenShot\\"+fileName);
		FileHandler.copy(src2, dest2);		
		
		for(int i=1; i<=5; i++)
		{
			Date date3 = new Date();
			String fileName3 = date3.toString().replace(":", " ").replace("-","_");
			TakesScreenshot take3 = (TakesScreenshot)driver;
			File src3 = take3.getScreenshotAs(OutputType.FILE);
			File dest3 = new File("E:\\28th May batch 1\\Auto ScreenShot\\"+i+fileName3);
			FileHandler.copy(src3, dest3);
		}
		
	}

}
