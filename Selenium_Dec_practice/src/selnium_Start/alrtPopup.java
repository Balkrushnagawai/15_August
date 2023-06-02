package selnium_Start;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alrtPopup {
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniun\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    
	  //input[@name='submit']
	    WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
	    submit.click();
	    
	    Thread.sleep(2000);
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	    Thread.sleep(2000);
	    alt.accept();
	    //or driver.switchTo().alert().accept();
	    
	    

		
	    
	    
	}

}
