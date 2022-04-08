package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//file path is given and stored file in ref variable 
FileInputStream MyFile= new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1.xlsx");
				
				
//String value = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue()
//System.out.println("Data form excel is "+value);
				
				
double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(2).getNumericCellValue();
			
System.out.println("Data form excel is "+value1);

	}

}
