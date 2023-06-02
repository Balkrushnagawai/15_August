package march_25;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement clickButton =driver.findElement(By.xpath("//a[text()='Create new account']"));
		clickButton.click();
		WebElement dayDropdown =driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(dayDropdown);
		s.selectByIndex(27);
		WebElement monthDropdown =driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(monthDropdown);
		s1.selectByValue("6");
		WebElement yearDropdown =driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(yearDropdown);
		s2.selectByVisibleText("1994");
		

	}

}
