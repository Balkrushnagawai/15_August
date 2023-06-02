package march_25;

import java.time.Duration;
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:/www.policybazaar.com");
		WebElement lifeInsuranceButton =driver.findElement(By.xpath("(//div[@class='shadowHandlerBox'])[1]"));
		lifeInsuranceButton.click();
		WebElement nameInputTab =driver.findElement(By.xpath("//input[@id='nameAdd']"));
		nameInputTab.click();
		nameInputTab.sendKeys("Dhanaji");
		WebElement dobInputTab =driver.findElement(By.xpath("//input[@id='dob']"));
		dobInputTab.sendKeys("18/05/1994");
		WebElement mobNoInputTab =driver.findElement(By.xpath("//input[@id='mobileNo']"));
		mobNoInputTab.sendKeys("8889999888");
		WebElement viewFreeQuitButton =driver.findElement(By.xpath("//span[text()='View Free Quotes ']"));
		viewFreeQuitButton.click();
		
		
	}

}
