package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec30 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d = new Dimension(300, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p= new Point(300, 600);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.close();
		Thread.sleep(5000);
		//driver.quit();
	}

}
