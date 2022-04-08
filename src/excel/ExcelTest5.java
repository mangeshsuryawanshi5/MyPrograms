package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		CellType type1 = MySheet.getRow(0).getCell(0).getCellType();
		CellType type2 = MySheet.getRow(0).getCell(1).getCellType();
		CellType type3 = MySheet.getRow(0).getCell(2).getCellType();
		CellType type4 = MySheet.getRow(0).getCell(3).getCellType();
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		
		String Value1 = MySheet.getRow(0).getCell(0).getStringCellValue();
		double Value2 = MySheet.getRow(0).getCell(1).getNumericCellValue();
		boolean Value3 = MySheet.getRow(0).getCell(2).getBooleanCellValue();
		String Value4=MySheet.getRow(0).getCell(3).getStringCellValue();	
		
		System.out.print(Value1+" ");
		System.out.print(Value2+" ");
		System.out.print(Value3+" ");
		System.out.print(Value4+" ");
		
		
		
	}

}
