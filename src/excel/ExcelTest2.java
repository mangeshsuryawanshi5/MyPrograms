package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		for(int i=0;i<=3;i++)
		{
			String Value = MySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(Value+" ");
		}
	}

}
