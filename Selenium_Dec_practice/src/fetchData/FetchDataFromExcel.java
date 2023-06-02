package fetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExcel {
	public static void main (String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");*/
		Thread.sleep(5000);
		//How to fetch data from Excel
		/*String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		String Value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		System.out.println(Value);*/
		
		//Break Method chaining
		/*String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet =workbook.getSheet("Sheet");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		String value =cell.getStringCellValue();
		System.out.println(value);*/
		
		//Using loop fetch multiple data
		String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet");
		int lastRowNum = sheet.getLastRowNum();
		for(int i=0; i<=lastRowNum; i++ )
		{
			Row row =sheet.getRow(i);
			Cell cell = row.getCell(1);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		/*FileInputStream fs = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		for(int i=0; i<=lastRow; i++){
		Row row = sheet1.getRow(i);
		Cell cell = row.createCell(2);

		cell.setCellValue("WriteintoExcel");*/
		
	}

}
