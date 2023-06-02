package march_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		WebElement imgDrag =driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement imgDrop =driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(imgDrag,imgDrop).perform();
	}

}
