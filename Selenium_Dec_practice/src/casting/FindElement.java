package casting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.facebook.com/");
		/*WebElement idButton = driver.findElement(By.id("email"));
		idButton.sendKeys("9511744095");
		
		WebElement passButton = driver.findElement(By.xpath("//input[@id='pass']"));
		passButton.sendKeys("krishna2892");
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();*/
		
		WebElement crNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		crNewAcc.click();
		Thread.sleep(5000);
		WebElement femaleRadioButon =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean frb =femaleRadioButon.isSelected();
		System.out.println(frb);
		boolean frbe =femaleRadioButon.isEnabled();
		System.out.println(frbe);
		boolean frbd =femaleRadioButon.isDisplayed();
		System.out.println(frbd);
		WebElement sinuptext =driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String st =sinuptext.getText();
		System.out.println(st);
	}

}
