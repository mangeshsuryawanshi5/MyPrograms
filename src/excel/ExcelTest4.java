package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		//Method fo getting rows from excel
		int LastRowNum = MySheet.getLastRowNum();
		System.out.println("Last row num is "+LastRowNum);
		int TotalNumOfRow = LastRowNum;
		
		//Method for getting cells
		
		short LastCellNum = MySheet.getRow(0).getLastCellNum();
		System.out.println("Last Cell num is "+LastCellNum);
		int TotalNumOfCell = LastCellNum-1;
		
		for(int i=0;i<=TotalNumOfRow;i++)
		{
			for(int j=0;j<=TotalNumOfCell;j++)
			{
				String Value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Value+" ");
			}
			System.out.println();
		}
		
		
	
	}

}
