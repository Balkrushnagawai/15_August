package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan01 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Point p =new Point(300, 500);
		driver.manage().window().setPosition(p);
		Dimension d = new Dimension(200, 500);
		driver.manage().window().setSize(d);
		//driver.close();
		//driver.quit();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		By b =By.xpath("//input[@id='email']");
		WebElement id =driver.findElement(b);
		id.sendKeys("9511744095");
		//or
		
		WebElement password = driver.findElement(By.xpath("//input[@id='email']"));
		password.sendKeys("krishna12345");
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logIn.click();
	}

}
