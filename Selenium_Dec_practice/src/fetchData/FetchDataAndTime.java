package fetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataAndTime {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Thread.sleep(3000);
		Date value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(7).getCell(1).getDateCellValue();
		System.out.println(value);
		
		
		
		
		
	}
 
}
  