package march_10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(3000);
		Alert alt =driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		//alt.sendKeys("12345");
		
	}

}
