package march_12;

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
		driver.get("https:/www.policybazaar.com");
		WebElement termLifeInsuranceButton = driver.findElement(By.xpath("(//div[@class='shadowHandlerBox'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(termLifeInsuranceButton).click().build().perform();
		//click()        -- for left click
		//doubleClick()  -- for left double click
		//contextClick() -- for right click
		//dragAndDrop()  -- for drag and drop
	}

}
