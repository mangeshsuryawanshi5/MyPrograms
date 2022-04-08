package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUploadingInExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\Book1.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(MyFile);
		XSSFSheet sh1 = Workbook.getSheet("Sheet1");
		XSSFRow row0 = sh1.createRow(0);
		
		String []s= {"Ameya","Tanmay","Sanket","Hitesh","Mangesh"};
		
		for(int i=0;i<=s.length-1;i++)
		{
			row0.createCell(i).setCellValue(s[i]);
		}
		
		FileOutputStream out=new FileOutputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\Book1.xlsx");
		Workbook.write(out);
		

	}

}
