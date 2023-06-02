package march_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		String path ="E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file =new FileInputStream(path);
		Thread.sleep(5000);
		WorkbookFactory.create(file).getSheet("Sheet").getRow(0).getCell(0).getStringCellValue();
	}
	
	

}
