package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec31 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//Thread.sleep(3000);
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		//Thread.sleep(3000);
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
		//Thread.sleep(3000);
		Dimension d = new Dimension(700, 300);
		driver.manage().window().setSize(d);
		//Thread.sleep(3000);
		Point p = new Point(500, 100);
		driver.manage().window().setPosition(p);
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		By b = By.xpath("//input[@id='email']");
		WebElement id = driver.findElement(b);
		id.sendKeys("9511744095");
		//By b = By.xpath("//input[@id='pass']");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("krishna12345");
		//button[text()='Log in']
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logIn.click();
		
	}

}
