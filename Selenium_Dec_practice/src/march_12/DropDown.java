package march_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class DropDown{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement crateNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		crateNewAcc.click();
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='day']"));

		Select s = new Select(dropDown);
		s.selectByVisibleText("16");
		
		
	}

}
