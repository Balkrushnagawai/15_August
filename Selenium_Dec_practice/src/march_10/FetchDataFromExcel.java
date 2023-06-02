package march_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		String path ="E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Thread.sleep(3000);
		WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	}

}
