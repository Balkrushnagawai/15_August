package march24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImpliciteWait {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/www.facebook.com");
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("9511744095");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("krishna12345");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.click();
		WebElement frndButton = driver.findElement(By.xpath("(//a[contains(@class,'x1i10hfl')])[3]"));
		frndButton.click();
	}

}
