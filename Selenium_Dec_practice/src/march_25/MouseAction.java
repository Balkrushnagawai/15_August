package march_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.policybazaar.com");
		WebElement insuranceProductDropDown = driver.findElement(By.xpath("//a[text()='Insurance Products ']"));
		WebElement noCostTerminsuranceButton = driver.findElement(By.xpath("//span[text()='No Cost Term Insurance ']"));

		Actions act = new Actions(driver);
		act.moveToElement(insuranceProductDropDown).moveToElement(noCostTerminsuranceButton).click().build().perform();
	}

}
