package march_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceAction {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.com");
		//Mouse Actions
		WebElement accAndList = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act = new Actions(driver);
		act.moveToElement(accAndList).perform();
		WebElement yourOrderButton = driver.findElement(By.xpath("//span[text()='Account']"));
		act.moveToElement(yourOrderButton).click().build().perform();
		
	}

}
