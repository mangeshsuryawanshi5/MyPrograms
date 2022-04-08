package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				
				String Value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Value+" ");
			}
			System.out.println();
		}

	}

}
