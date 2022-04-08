package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1.xlsx");
		
		Workbook test = WorkbookFactory.create(MyFile);
		Sheet MySheet = test.getSheet("Sheet2");
		Row MyRow = MySheet.getRow(0);
		Cell MyCell = MyRow.getCell(0);
		String MyValue = MyCell.getStringCellValue();
		
		System.out.println(MySheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(MySheet.getRow(0).getCell(1).getStringCellValue());
	}

}
