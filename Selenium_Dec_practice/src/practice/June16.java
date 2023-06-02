package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June16 {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*By b = By.xpath("");
		WebElement id = driver.findElement(b);
		id.click();*/
		
		WebElement id = driver.findElement(By.xpath(""));
		id.sendKeys("9511744095");
		
		WebElement passward = driver.findElement(By.xpath(""));
		passward.sendKeys("krishna12345");
		WebElement logIn =driver.findElement(By.xpath(""));
		logIn.click();
		//Actions on Browser
		driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.flipcart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Dimension d =new Dimension(200, 800);
		driver.manage().window().setSize(d);
		Point p = new Point(200, 800);
		driver.manage().window().setPosition(p);
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
