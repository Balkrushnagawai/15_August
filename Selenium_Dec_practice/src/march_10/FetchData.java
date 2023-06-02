package march_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//How to fetch data from Excel
		String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		String Value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		System.out.println(Value);
	}

}
