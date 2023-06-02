package april_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By b = By.xpath("//input[@id='email']");
		WebElement id =driver.findElement(b);
		id.sendKeys("9511744095");
		WebElement acc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		acc.click();
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		Boolean isSelectedFemaleRadioButton =femaleRadioButton.isSelected();
		System.out.println(isSelectedFemaleRadioButton);
	}

}
