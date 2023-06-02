package march_10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("windows.scrollBy(0,100)");
		js.executeScript("windows.scrollBy(0,100)");
	}

}
