package readData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1 : Creating FIS
		FileInputStream fis = new FileInputStream("E:\\WSS05-Selenium\\Book1.xlsx");
		
		//Step 2 : Create Workbook object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Step 3 : read methods
		String s1data = workbook.getSheet("Sheet1").getRow(7).getCell(3).getStringCellValue();
		System.out.println(s1data);
	}

}
