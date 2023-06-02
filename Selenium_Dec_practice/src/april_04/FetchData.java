package april_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {
	public static void main (String[]args) throws EncryptedDocumentException, IOException
	{
		String path = new String("E:\\28th May batch 1\\Excel Files\\Book1.xlsx");
		FileInputStream file = new FileInputStream(path);
		String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
	}

}
//String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
//FileInputStream file = new FileInputStream(path);
//String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
//System.out.println(value);