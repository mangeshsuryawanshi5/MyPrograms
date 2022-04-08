
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		
		String myUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = MySheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		ZerodhaLoginPage login= new ZerodhaLoginPage(driver);
		login.sendUserID(myUserID);
		login.sendPassword(myPassword);
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		ZerodhaPinPage pin=new ZerodhaPinPage(driver);
		pin.sendPin(myPin);
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		ZerodhaHomePage home=new ZerodhaHomePage(driver);
		home.validateUserID();
		home.clickOnLogoutButton();
		
		driver.close();
		
		
	}

}
