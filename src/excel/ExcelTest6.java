package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		int rowCount = MySheet.getLastRowNum();
		int columnCount = MySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=columnCount;j++)
			{
				 Cell info = MySheet.getRow(i).getCell(j);//String,Numeric,Boolean
				
				CellType type = info.getCellType();
				
				if(type==CellType.STRING)
				{
					String value = info.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(type==CellType.NUMERIC)
				{
					double value = info.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(type==CellType.BOOLEAN)
				{
					boolean value = info.getBooleanCellValue();
					System.out.print(value+" ");
					
				}
			}
			
			System.out.println();
		}
	}

}
