package fetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchNumericData {
	public static void main (String[]args) throws EncryptedDocumentException, IOException
	{
		String path = "E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(1).getNumericCellValue();
		System.out.println(value);
	}

}
