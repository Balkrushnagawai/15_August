package april_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By b = By.xpath("//input[@id='email']");
		WebElement id =driver.findElement(b);
		id.sendKeys("9511744095");
		WebElement pass = driver.findElement(By.xpath("//button[text()='Log in']"));
		pass.sendKeys("ssss");
		
	}
	

}
