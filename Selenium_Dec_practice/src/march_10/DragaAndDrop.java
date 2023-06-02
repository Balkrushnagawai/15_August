package march_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
		//DragAndDrop
		WebElement src =driver.findElement(By.xpath(""));
		WebElement dest =driver.findElement(By.xpath(""));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();

	}

}
