package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jan05 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.amazon.com");
		Thread.sleep(5000);
		//mouce Actions
		By b =By.xpath("//a[@id='nav-link-accountList']");
		WebElement acc =driver.findElement(b);
		By b1 = By.xpath("//a[@id='nav_prefetch_yourorders']");
		WebElement yourOrder = driver.findElement(b1);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		/*Actions a = act.moveToElement(acc).moveToElement(yourOrder).click(yourOrder);
		a.perform();*/
		//or
		/*act.moveToElement(acc).moveToElement(yourOrder).click().build().perform();*/
		//or
		act.moveToElement(acc).perform();
		act.moveToElement(yourOrder).perform();
		act.click().perform();
		
		WebDriver dri =new ChromeDriver();
		dri.get("http:www.facebook.com");
		//perform drop down
		Thread.sleep(5000);
		WebElement createNewAcc =dri.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAcc.click();
		Thread.sleep(3000);
		WebElement dayDropDown = dri.findElement(By.xpath("//select[@id='day']"));
		Select s =new Select(dayDropDown);
		s.selectByIndex(28);
		WebElement monthDropDown = dri.findElement(By.xpath("//select[@id='month']"));
		Select s1= new Select(monthDropDown);
		s1.selectByValue("Jun");
		WebElement yearDropDown = dri.findElement(By.xpath("//select[@id='year']"));
		Select s2= new Select(yearDropDown);
		s2.selectByVisibleText("1992");
	
	}

}
