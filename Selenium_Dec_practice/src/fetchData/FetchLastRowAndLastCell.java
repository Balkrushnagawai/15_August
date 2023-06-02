package fetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchLastRowAndLastCell {
	public static void main (String[]args) throws EncryptedDocumentException, IOException
	{
		String path ="E:\\28th May batch 1\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sheet =WorkbookFactory.create(file).getSheet("Sheet1");
		int lastValue = sheet.getLastRowNum();
		System.out.println(lastValue);
		Row row = sheet.getRow(0);
		int lastCell =row.getLastCellNum();
		System.out.println(lastCell);
	}

}
