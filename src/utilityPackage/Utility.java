package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility 
{
	 static Sheet MySheet;
	public static String readdataFromExcel (int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
	    MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
	    String value = MySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	    return value;
	}
	
	public static void takeScreenshot (WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Mangesh\\Velocity\\Selenium\\Screenshot\\TC"+TCID+".Screenshot.png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC "+TCID, true);
		
		
	}
	
	
}
