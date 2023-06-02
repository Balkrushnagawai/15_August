package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement createNewButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewButton.click();
		
		Thread.sleep(5000);
		WebElement dayDropDown =driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(dayDropDown);
		//s.selectByIndex(15);
		s.selectByVisibleText("16");
		Thread.sleep(3000);
		WebElement monthDropDown =driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(monthDropDown);
		//s1.selectByValue("6");
		s1.selectByVisibleText("Jun");
		WebElement yearDropDown =driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(yearDropDown);
		s2.selectByVisibleText("1950");
		
	}
}
