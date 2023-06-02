package march_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsOnWebDriver {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.policybazaar.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		String currentTitle =driver.getCurrentUrl();
		System.out.println(currentTitle);
		String title =driver.getTitle();
		System.out.println(title);
		Thread.sleep(10000);
		Point p = new Point(100, 400);
		driver.manage().window().setPosition(p);
		Thread.sleep(10000);
		Dimension d = new Dimension(100, 100);
		driver.manage().window().setSize(d);
		//driver.close();
		
	
	}

}
