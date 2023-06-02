package march_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https:/www.facebook.com");
		WebElement createNewAcc =driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAcc.click();
		Thread.sleep(3000);
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(dayDropDown);
		s.selectByIndex(27);
	}

}
