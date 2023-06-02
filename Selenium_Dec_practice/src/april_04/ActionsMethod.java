package april_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod {
	public static void main (String[]args)
	{
		System.setProperty("webDriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement accAndListButton = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement yourAccButton = driver.findElement(By.xpath("//span[text()='Account']"));
		Actions act = new Actions(driver);
		act.moveToElement(accAndListButton).click(yourAccButton).build().perform();
		
	}

}
