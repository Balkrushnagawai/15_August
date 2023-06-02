package casting;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		String title =driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p =new Point(100, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
	
	}

}
