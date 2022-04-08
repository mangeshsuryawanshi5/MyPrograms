package kitePOMTestNG;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestingKiteUsingTestNG {
  WebDriver driver;
  Sheet MySheet;
  KiteLoginPage login;
  KitePinPage pin;
  KiteHomePage home;
  @Parameters("browserName")
  @BeforeClass
  public void KiteTestUsingTestNG(String browser) throws EncryptedDocumentException, IOException
  {
	  if(browser.equals("chrome"))
	  {
	  Reporter.log("Launching chrome browser",true);
	  System.setProperty("webdriver.chrome.driver", "E:\\Mangesh\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  driver=new ChromeDriver(opt);
	  }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\Mangesh\\Velocity\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  FirefoxOptions opt=new FirefoxOptions();
		  driver=new FirefoxDriver(opt);
		  
		  
	  }
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Browser launched successfully",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  FileInputStream MyFile=new FileInputStream("E:\\Mangesh\\Velocity\\Selenium\\Excel\\ExcelTest1..xlsx");
	  MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
	  
  }
  
  @BeforeMethod
  public void LoginToKite ()
  {
	  String USERID = MySheet.getRow(0).getCell(0).getStringCellValue();
	  String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
	  String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
	  Reporter.log("Entering UerID and Password",true);
	  login.sendUserID(USERID);
	  login.sendPassword(PWD);
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  Reporter.log("Entering Pin",true);
	  pin.sendPin(PIN);
	  pin.clickOnContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
  }
  
  @Test
  public void validateUserID ()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("Validating User ID",true);  
	  String ExpectedUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
	  String ActualUserID = home.validateUserID();
	  Assert.assertEquals(ExpectedUserID, ActualUserID, "Actual and Expected User ID not matching");
	  Reporter.log("UserID Validated successfully, TC is passed",true);
  }
  
  @AfterMethod
  public void logoutFromKite () throws InterruptedException
  {
	  Reporter.log("Logging out",true);
	  home.clickOnLogoutButton();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
  
  
  }
