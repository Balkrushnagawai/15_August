package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan04 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension d = new Dimension(100, 500);
		driver.manage().window().setSize(d);
		Point p = new Point(200, 600);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		//By b = By.xpath("//input[@id='email']");
		//WebElement delivery = driver.findElement(b);
		//delivery.click();
		
		//Or
		/*WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("9511744095");
		WebElement passward = driver.findElement(By.xpath("//input[@id='pass']"));
		passward.sendKeys("krishna12345");
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logIn.click(); */
		
		//Create new account
		//a[text()='Create New Account']
		//a[text()='Create New Account']
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAcc.click();
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		//radiobutton.click();
		boolean femaleRadioButtonIsselected = radioButton.isSelected();
		//System.out.println(femaleRadioButtonIsselected);
		if(femaleRadioButtonIsselected==true)
		{
			System.out.println("test is fail");
		}
		else
		{
			System.out.println("test is pass");
		}
		boolean femaleRadioButtonIsEnabled = radioButton.isEnabled();
		//System.out.println(femaleRadioButtonIsEnabled);
		if(femaleRadioButtonIsEnabled)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		boolean femaleRadioButtonIsDisplayed = radioButton.isDisplayed();
		//System.out.println(femaleRadioButtonIsDisplayed);
		if(femaleRadioButtonIsDisplayed==true)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		
		WebElement radioButton1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean maleRadioButtonIsselected = radioButton1.isSelected();
		//System.out.println(maleRadioButtonIsselected);
		if(maleRadioButtonIsselected==true)
		{
			System.out.println("test is fail");
		}
		else
		{
			System.out.println("test is pass");
		}
		boolean maleRadioButtonIsEnabled = radioButton1.isEnabled();
		System.out.println(maleRadioButtonIsEnabled);
		if(maleRadioButtonIsEnabled)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		boolean maleRadioButtonIsDisplayed = radioButton1.isDisplayed();
		System.out.println("maleRadioButtonIsDisplayed");
		if(maleRadioButtonIsDisplayed==true)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		WebElement radioButton2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean customRadioButtonIsselected = radioButton2.isSelected();
		System.out.println(customRadioButtonIsselected);
		if(customRadioButtonIsselected==true)
		{
			System.out.println("test is fail");
		}
		else
		{
			System.out.println("test is pass");
		}
		boolean customRadioButtonIsEnabled = radioButton2.isEnabled();
		System.out.println(customRadioButtonIsEnabled);
		if(customRadioButtonIsEnabled)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		boolean customRadioButtonIsDisplayed = radioButton2.isDisplayed();
		System.out.println("customRadioButtonIsDisplayed");
		if(customRadioButtonIsDisplayed==true)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
	}

}
