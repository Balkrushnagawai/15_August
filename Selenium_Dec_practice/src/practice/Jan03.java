package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan03 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Dimension d= new Dimension(200, 600);
		driver.manage().window().setSize(d);
		Point p = new Point(100, 600);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.quit();
		//driver.close();

		/*WebElement id  = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("9511744095");
		WebElement passward = driver.findElement(By.xpath("//input[@id='pass']"));
		passward.sendKeys("krishna12345");
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logIn.click();*/
		
		//Create new account tab
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAcc.click();
		Thread.sleep(5000);
		WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean femaleRadioButtonSelect = radioButton.isSelected();
		System.out.println(femaleRadioButtonSelect);
		if(femaleRadioButtonSelect==true)
		{
			System.out.println("Test is fail");
		}
		else
		{
			System.out.println("Test is pass");
		}
		boolean femaleRadioButtonEnable = radioButton.isEnabled();
		if(femaleRadioButtonEnable==true)
		{
			System.out.println("Test is pass ");
		}
		else
		{
			System.out.println("Test is fail");
		}
		boolean femaleRadioButtonDisplay = radioButton.isDisplayed();
		if(femaleRadioButtonDisplay==true)
		{
			System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		WebElement radioButton1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean maleMadioButtonSelect = radioButton1.isSelected();
		if(maleMadioButtonSelect==true)
		{
			System.out.println("Test is fail");
		}
		else
		{
			System.out.println("Test is pass");
		}
		boolean maleRadioButtonEnable = radioButton.isEnabled();
		if(maleRadioButtonEnable==true)
		{
			System.out.println("Test is pass ");
		}
		else
		{
			System.out.println("Test is Fail");
		}
		boolean maleRadioButtonDisplay = radioButton.isDisplayed();
		if(maleRadioButtonDisplay==true)
		{
			System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		WebElement radioButton3 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean customMadioButtonSelect = radioButton1.isSelected();
		if(customMadioButtonSelect==true)
		{
			System.out.println("Test is fail");
		}
		else
		{
			System.out.println("Test is pass");
		}
		boolean customRadioButtonEnable = radioButton.isEnabled();
		if(customRadioButtonEnable==true)
		{
			System.out.println("Test is pass ");
		}
		else
		{
			System.out.println("Test is Fail");
		}
		boolean customRadioButtonDisplay = radioButton.isDisplayed();
		if(customRadioButtonDisplay==true)
		{
			System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("test is fail");
		}

	}

}
