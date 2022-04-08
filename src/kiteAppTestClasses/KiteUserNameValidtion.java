package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import kitePOMClasses.KiteHomePage;
import kitePOMTestNG.KiteLoginPage;
import kitePOMTestNG.KitePinPage;
import utilityPackage.Utility;

public class KiteUserNameValidtion extends Base {
  
  KiteLoginPage login;
  KitePinPage pin;
  KiteHomePage home;
  @BeforeClass
  public void browserLaunch()
  {
	  launchBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
  }
  
  @BeforeMethod
  public void loggingToKiteApp () throws EncryptedDocumentException, IOException
  {
	login.sendUserID(Utility.readdataFromExcel(0, 0));
	login.sendPassword(Utility.readdataFromExcel(0, 1));
	login.clickOnLoginButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	pin.sendPin(Utility.readdataFromExcel(0, 2));
	pin.clickOnContinueButton();
  }
  
  @Test
  public void validatUserName() throws EncryptedDocumentException, IOException
  {
	  int TCID=100;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String actualUserID = home.getActualUserID();
	  String expectedUserID = Utility.readdataFromExcel(0, 0);
	  
	  Assert.assertEquals(expectedUserID, actualUserID, "actual and expected not matching");
	  Utility.takeScreenshot(driver, TCID);
	  Reporter.log("Validate UserName", true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp () throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("Loggiing out", true);
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @AfterClass
  public void closingBowser()
  {
	  driver.close();
	  
  }
}
